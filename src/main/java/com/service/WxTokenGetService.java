package com.service;

import com.util.ConstantParam;
import com.util.HttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;

@Service
public class WxTokenGetService {
    public static String token = "";
    public static long timestamp = System.currentTimeMillis();
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String weiChatUrl = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+ ConstantParam.appid+"&secret="+ConstantParam.appsecret;
    private static final String getCodeUrl = "https://api.weixin.qq.com/sns/oauth2/access_token?appid="+ConstantParam.appid+"&secret="+ConstantParam.appsecret;

    public String tokenReq(){
        long now = System.currentTimeMillis();
        String accessToken="";
        if(token!=null&&!("".equals(token))&&(now - timestamp)<7000000){
            accessToken = token;
        }
        else{
            logger.info("tokenReq req = "+ weiChatUrl);
            String obj = HttpClient.getAccessToken(weiChatUrl);
            JSONObject response = JSONObject.parseObject(obj);
            accessToken = response.getString("access_token");
            logger.info("tokenReq response= "+ response);
            token = accessToken;
            timestamp=System.currentTimeMillis();
        }
        return accessToken;
    }
    public String getUserInfo(String openId){
        String userInfoUrl="https://api.weixin.qq.com/cgi-bin/user/info?access_token="+tokenReq()+"&openid="+openId+"&lang=zh_CN";
        logger.info("getUserInfo req = "+ userInfoUrl);
        String obj = HttpClient.getAccessToken(userInfoUrl);
        JSONObject response = JSONObject.parseObject(obj);
        String username = response.getString("nickname");
        logger.info("getUserInfo response= "+ response.toJSONString());
        return username;
    }
    public String getUserOpenId(String code){
        String reqUrl = getCodeUrl+"&code="+code+"&grant_type=authorization_code";
        logger.info("getUserOpenId req = "+ reqUrl);
        String obj = HttpClient.getAccessToken(reqUrl);
        JSONObject response = JSONObject.parseObject(obj);
        String openId = response.getString("openid");
        logger.info("getUserOpenId response= "+ response);
        return openId;
    }
}
