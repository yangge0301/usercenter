package com.controller;

import com.service.CoreService;
import com.service.WxTokenGetService;
import com.util.ConstantParam;
import com.util.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.io.PrintWriter;


@Controller
@RequestMapping(value="/portal",produces="text/plain;charset=UTF-8")
public class ServiceInitController {
    @Autowired
    public WxTokenGetService wxTokenGetService;
    @Autowired
    public CoreService coreService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value="/log",produces="text/plain;charset=UTF-8") //提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理。
    @ResponseBody
    public String sayHello(){
        logger.info("hello world");
        return "Hello,World!大厦";
    }
    @RequestMapping(value="/gettc",produces="text/plain;charset=UTF-8") //提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理。
    @ResponseBody
    public String getToken(){
        String token = wxTokenGetService.tokenReq();
        logger.info("token = "+ token);
        return token;

    }
    @RequestMapping(value="/intopage",produces="text/plain;charset=UTF-8") //提供路由信息，”/“路径的HTTP Request都会被映射到sayHello方法进行处理。
    public String intoPage(HttpServletRequest request, HttpServletResponse response){
        try{
            String code = request.getParameter("code");
            String state = request.getParameter("state");
            logger.info("code = "+ code+"&state="+state);
            String openId = wxTokenGetService.getUserOpenId(code);
            String redirectUrl = null;
            // TODO: 2018/7/4  根据openid获取用户信息，并获取是否绑定
            // TODO: 2018/7/4 根据用户 是否绑定来未用户进行跳转/session赋值
            // TODO: 2018/7/4 如果没有绑定，则跳转绑定页面
//            redirectUrl = ConstantParam.findRedirectUrl("992");
            //根据status获取跳转url路径，status是刷菜单的时候，携带的status字段
            redirectUrl = ConstantParam.findRedirectUrl(state);
            request.setCharacterEncoding("utf-8");
            int res = state==null ? 1:Integer.parseInt(state) ;

//            redirectUrl = redirectUrl+"&openId = "+openId;

            logger.info("redirectUrl = "+ redirectUrl);
            return "redirect:"+redirectUrl;

        }
        catch(Exception e){
            e.printStackTrace();
        }
        //异常跳转到404页面
    return "";

    }


    @RequestMapping(value="wxsign",produces="text/plain;charset=UTF-8")
    @ResponseBody
    public void intoUserCenter(HttpServletRequest request, HttpServletResponse response){

        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        logger.info("signature="+signature+"&timestamp="+timestamp+"&nonce="+nonce+"&echostr="+echostr);
        PrintWriter out = null;
        try{
            out = response.getWriter();
            if (SignUtil.checkSignature(signature, timestamp, nonce)) {
                if(null != echostr && !"".equals(echostr)){
                    //服务器验证消息请求
                    out.write(echostr);
                }
                else{
                    //处理用户消息
                    InputStream inputStream = request.getInputStream();
                    String respXml = coreService.processRequest(inputStream,signature,timestamp,nonce,echostr);
                    logger.info("returnMsg:===>>signature="+signature+",["+respXml+"]");
                    out.write(respXml);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            if(null != out){
                out.close();
            }
        }

    }
}

