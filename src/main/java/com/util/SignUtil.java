package com.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.wxcrypt.AesException;
import com.wxcrypt.WXBizMsgCrypt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 请求校验工具类
 * 
 */
public class SignUtil {

	public static String TAG = "SignUtil";

	/**
	 * 与开发模式接口配置信息中的Token保持一致
	 */
	private static String token = "2018zyycheck";

	/**
	 * 校验签名
	 * 
	 * @param signature
	 *            微信加密签名
	 * @param timestamp
	 *            时间戳
	 * @param nonce
	 *            随机数
	 * @return
	 */
	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		Logger logger = LoggerFactory.getLogger(SignUtil.class);
		Date utilDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = sdf.format(utilDate);
		logger.info(TAG + " checkSignature " + str);
		// 对token、timestamp和nonce按字典排序
		String[] paramArr = new String[] { token, timestamp, nonce };
		Arrays.sort(paramArr);

		// 将排序后的结果拼接成一个字符串
		String content = paramArr[0].concat(paramArr[1]).concat(paramArr[2]);

		String ciphertext = null;
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			// 对接后的字符串进行sha1加密
			byte[] digest = md.digest(content.toString().getBytes());
			ciphertext = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		// 将sha1加密后的字符串与signature进行对比
		boolean flag = ciphertext != null ? ciphertext.equals(signature.toUpperCase()) : false;
		logger.info(TAG + " checkSignature result: " + flag);
		return flag;
	}

	/**
	 * 将字节数组转换为十六进制字符串
	 * 
	 * @param byteArray
	 * @return
	 */
	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * 
	 * @param mByte
	 * @return
	 */
	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];

		String s = new String(tempArr);
		return s;
	}

	/**
	 * 解密微信发过来的密文
	 *
	 * @return 加密后的内容
	 */
	public static String decryptMsg(String msgSignature,String timeStamp,String nonce,String encrypt_msg) {
		WXBizMsgCrypt pc;
		String result ="";
		try {
			pc = new WXBizMsgCrypt(token, ConstantParam.encodingAESKey, ConstantParam.appid);
			result = pc.decryptMsg(msgSignature, timeStamp, nonce, encrypt_msg);
		} catch (AesException e) {

			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 加密给微信的消息内容
	 * @param replayMsg
	 * @param timeStamp
	 * @param nonce
	 * @return
	 */
	public static String ecryptMsg(String replayMsg,String timeStamp, String nonce) {
		WXBizMsgCrypt pc;
		String result ="";
		try {
			pc = new WXBizMsgCrypt(token, ConstantParam.encodingAESKey, ConstantParam.appid);
			result = pc.encryptMsg(replayMsg, timeStamp, nonce);
		} catch (AesException e) {

			e.printStackTrace();
		}
		return result;
	}


}