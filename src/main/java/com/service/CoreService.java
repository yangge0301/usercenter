package com.service;

import com.bean.messagebean.text.TextMessage;
import com.util.ConstantParam;
import com.util.MessageUtil;
import com.wxcrypt.WXBizMsgCrypt;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
/**
 * 核心服务类
 */
@Service
public class CoreService {

	public static String TAG = "WeiChatService";
	@Autowired
	public WxTokenGetService wxTokenGetService;
	private org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

	/**
	 * 处理微信发来的请求
	 *
	 * @param inputStream
	 * @return xml
	 * @throws FileNotFoundException
	 */
	public String processRequest(InputStream inputStream,String signature,String timeStamp,String nonce,String echostr,Map<String, String> resMap,String model) {
		Date utilDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = sdf.format(utilDate);
		// xml格式的消息数据
		String respXml = null;
		Map<String, String> requestMap = null;
		try {
			if(null!=model&&"aes".equals(model)){
				requestMap = resMap;
			}
			else{
				// 调用parseXml方法解析请求消息
				requestMap = MessageUtil.parseXml(inputStream);
			}
			JSONObject jsonObject = JSONObject.fromObject(requestMap);
			logger.info("reqMsg:===>>signature="+signature+",[" + jsonObject.toString() + "]");
			// 发送方帐号
			String fromUserName = requestMap.get("FromUserName");
			// 开发者微信号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String event = requestMap.get("Event");
			// event
			String msgType = requestMap.get("MsgType");
			// key类型
			String eventKey = requestMap.get("EventKey");
			// key类型
			String ticket = requestMap.get("Ticket");
			//记录入库
//			MessageGetService.insertMessages(requestMap, msgType);

			if ("event".equals(msgType) && "subscribe".equals(event)) {
				respXml = MessageUtil.messageToXml(userSubscribe(event, fromUserName, toUserName));

				String userName = wxTokenGetService.getUserInfo(fromUserName);
				respXml = respXml.replaceAll("\\{USERNAME\\}",userName);
//				logger.info(TAG + " subscribe: " + respXml);
				return respXml;
			} else if ("event".equals(msgType) && "unsubscribe".equals(event)) {

				logger.info(TAG + " unsubscribe: " + jsonObject.toString());
			} else if ("event".equals(msgType) && "card_sku_remind".equals(event)) {



			}
			else if ("event".equals(msgType) && "CLICK".equals(event)) {
				// click关键字
				if ("XXXX".equals(eventKey)) {

				}
			}else if ("text".equals(msgType)) {
				String content=requestMap.get("Content");
				respXml = MessageUtil.messageToXml(userSubscribe(content, fromUserName, toUserName));
				return respXml;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	/**
	 *
	 *处理文本消息
	 * **/
	public TextMessage userSubscribe(String str, String fromUserName, String toUserName) {
		TextMessage textMessage = new TextMessage();
		textMessage.setToUserName(fromUserName);
		textMessage.setFromUserName(toUserName);
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(MessageUtil.MESSAGE_TYPE_TEXT);
		String res = ConstantParam.findResponseText(str);
		if( res == null || res.equals("")){
			res = ConstantParam.findResponseText("else");
		}
		textMessage.setContent(res);
		return textMessage;
	}
}