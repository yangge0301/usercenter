package com.util;

import java.util.HashMap;
import java.util.Map;

public class ConstantParam {
    public final static String appid =  "wx44a67de4ee5b4da1";
    public final static String appsecret = "43bdbd7870662ca5b43c3876a8037821";
    public final static String encodingAESKey = "aya89dKnqhERR6fFHatQU7LhdEhJ1CXFzfo2aCecsbT";

    public final  static String welcomeText=
            "您好呀，很高兴和你成为朋友~沃特权圈圈随时为您服务，您可在对话框内输入以下数字进行解答\n" +
                    "【1】精彩权益\n" +
                    "【2】绑定手机号\n" +
                    "【3】我的卡券包\n" +
                    "【4】问题咨询\n" +
                    "【5】畅越/低消专区";

    private static final Map<String, String> keyWords = new HashMap<String, String>();

    private static final Map<String, String> redirectUrls = new HashMap<String, String>();
    private static final Map<String, String> redUrls = new HashMap<String, String>();

    static {
        redUrls.put("cydx","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=1#wechat_redirect");
        redUrls.put("ofoq","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=2#wechat_redirect");
        redUrls.put("ykkq","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=3#wechat_redirect");
        redUrls.put("gdym","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=4#wechat_redirect");
        redUrls.put("tqzx","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=5#wechat_redirect");
        redUrls.put("wdkq","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=6#wechat_redirect");
        redUrls.put("rmqy","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=7#wechat_redirect");
        redUrls.put("cxqy","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=8#wechat_redirect");
        redUrls.put("yyqy","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=9#wechat_redirect");
        redUrls.put("dsqy","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=10#wechat_redirect");
        redUrls.put("jrqy","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=11#wechat_redirect");
        redUrls.put("qyhy","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=12#wechat_redirect");
        redUrls.put("sjbd","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=13#wechat_redirect");
        redUrls.put("wdkqb","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=14#wechat_redirect");
        redUrls.put("wtzx","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=15#wechat_redirect");
        redUrls.put("cydxzq","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=16#wechat_redirect");

        redUrls.put("else","https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx4d316bf14ba29b78&redirect_uri=http://www.mubag.top/portal/intopage?response_type=code&scope=snsapi_base&state=991#wechat_redirect");


        redirectUrls.put("1","http://qy.chinaunicom.cn/mobile-h5/card/card_list_tencent.html?a=1");
        redirectUrls.put("2","https://qy.chinaunicom.cn/mobile/redirectTo?url=http://t.cn/Rri28yL");
        redirectUrls.put("3","https://qy.chinaunicom.cn/mobile/redirectTo?url=http://t.cn/RBcZq8G");
        redirectUrls.put("4","http://qy.chinaunicom.cn/mobile-h5/main/classify.html?a=1");
        redirectUrls.put("5","http://qy.chinaunicom.cn/mobile-h5/main/userarea.html?a=1");
        redirectUrls.put("6","http://qy.chinaunicom.cn/mobile-h5/cardVoucher/index.html?a=1");
        redirectUrls.put("7","http://qy.chinaunicom.cn/mobile-h5/main/classify.html?actCatType=1");
        redirectUrls.put("8","http://qy.chinaunicom.cn/mobile-h5/main/classify.html?actCatType=4");
        redirectUrls.put("9","http://qy.chinaunicom.cn/mobile-h5/main/classify.html?actCatType=3");
        redirectUrls.put("10","http://qy.chinaunicom.cn/mobile-h5/main/classify.html?actCatType=5");
        redirectUrls.put("11","http://qy.chinaunicom.cn/mobile-h5/main/classify.html?actCatType=2");
        redirectUrls.put("12","https://qy.chinaunicom.cn/mobile-h5/1806activity/teamGo.html?a=1");
        redirectUrls.put("13","https://qy.chinaunicom.cn/mobile-h5/wxhtml/bind.html?a=1");
        redirectUrls.put("14","https://qy.chinaunicom.cn/mobile-h5/cardVoucher/index.html?a=1");
        redirectUrls.put("15","https://qy.chinaunicom.cn/mobile-h5/user/complaint.html?a=1");
        redirectUrls.put("16","https://qy.chinaunicom.cn/mobile-h5/card/card_list_tencent.html?a=1");
        redirectUrls.put("990","http://qy.chinaunicom.cn/mobile-h5/card/card_list_tencent.html?a=1");
        redirectUrls.put("991","http://qy.chinaunicom.cn/mobile-h5/main/userarea.html?a=1");
        redirectUrls.put("992","http://qy.chinaunicom.cn/mobile-h5/wxhtml/notice.html?a=1");

        //<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n
        keyWords.put("subscribe", " Hi~ {USERNAME}，谢谢你长得这么好看还关注我\uD83D\uDE0A \n" +
                "-------------------------\n"+
                ">>><a href='"+ConstantParam.findRedUrl("sjbd")+"'>绑定手机</a>→超多羊毛等你来薅哦\n" +
                "-------------------------\n"+
                ">>>快来瞅瞅小伙伴们都爱pick的热门活动吧：\n" +
                "1.<a href='"+ConstantParam.findRedUrl("qyhy")+"'>拆红包享特权☞看这里</a>\n" +
                ""+
                "2.<a href='"+ConstantParam.findRedUrl("ofoq")+"'>ofo免费骑行☞看这里</a>\n" +
                "3.<a href='"+ConstantParam.findRedUrl("ykkq")+"'>优酷免流看球☞看这里</a>\n" +
                "4.<a href='"+ConstantParam.findRedUrl("cydx")+"'>畅越/低消送特权☞看这里</a>\n" +
                "5.<a href='"+ConstantParam.findRedUrl("gdym")+"'>更多活动\uD83D\uDC11☞看这里</a>\n" +
                "-------------------------\n"+
                "更多权益和羊毛尽在下方菜单栏哦！\n" );
        keyWords.put("导航", " " +
                "您好呀，很高兴和你成为朋友~沃特权圈圈随时为您服务，您可在对话框内输入以下数字进行解答\n" +
                "【1】拆红包特权\n" +
                "【2】精彩权益\n" +
                "【3】绑定手机号\n" +
                "【4】我的卡券包\n" +
                "【5】问题咨询\n" +
                "【6】畅越/低消专区");
        keyWords.put("你好", " " +
                "您好呀，很高兴和你成为朋友~沃特权圈圈随时为您服务，您可在对话框内输入以下数字进行解答\n" +
                "【1】拆红包特权\n" +
                "【2】精彩权益\n" +
                "【3】绑定手机号\n" +
                "【4】我的卡券包\n" +
                "【5】问题咨询\n" +
                "【6】畅越/低消专区");
        keyWords.put("hello", " " +
                "您好呀，很高兴和你成为朋友~沃特权圈圈随时为您服务，您可在对话框内输入以下数字进行解答\n" +
                "【1】拆红包特权\n" +
                "【2】精彩权益\n" +
                "【3】绑定手机号\n" +
                "【4】我的卡券包\n" +
                "【5】问题咨询\n" +
                "【6】畅越/低消专区");
        keyWords.put("hi", " " +
                "您好呀，很高兴和你成为朋友~沃特权圈圈随时为您服务，您可在对话框内输入以下数字进行解答\n" +
                "【1】拆红包特权\n" +
                "【2】精彩权益\n" +
                "【3】绑定手机号\n" +
                "【4】我的卡券包\n" +
                "【5】问题咨询\n" +
                "【6】畅越/低消专区");
        keyWords.put("else", " " +
                "您好呀，很高兴和你成为朋友~沃特权圈圈随时为您服务，您可在对话框内输入以下数字进行解答\n" +
                "【1】拆红包特权\n" +
                "【2】精彩权益\n" +
                "【3】绑定手机号\n" +
                "【4】我的卡券包\n" +
                "【5】问题咨询\n" +
                "【6】畅越/低消专区");

        keyWords.put("【1】拆红包特权",
                        "19.99元=31天腾讯视频会员+5GB全国流量，立即申请<a href='"+ConstantParam.findRedUrl("qyhy")+"'>【请点这里】</a>\n");
        keyWords.put("1",
                "19.99元=31天腾讯视频会员+5GB全国流量，立即申请<a href='"+ConstantParam.findRedUrl("qyhy")+"'>【请点这里】</a>\n");
        keyWords.put("【1】",
                "19.99元=31天腾讯视频会员+5GB全国流量，立即申请<a href='"+ConstantParam.findRedUrl("qyhy")+"'>【请点这里】</a>\n");
        keyWords.put("拆红包特权",
                "19.99元=31天腾讯视频会员+5GB全国流量，立即申请<a href='"+ConstantParam.findRedUrl("qyhy")+"'>【请点这里】</a>\n");
        keyWords.put("拆红包",
                "19.99元=31天腾讯视频会员+5GB全国流量，立即申请<a href='"+ConstantParam.findRedUrl("qyhy")+"'>【请点这里】</a>\n");
        keyWords.put("【2】精彩权益", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("2", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("【2】", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("精彩权益", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("【3】绑定手机号",
                "亲爱滴：\n" +
                        "【手机绑定】<a href='"+ConstantParam.findRedUrl("sjbd")+"'>【请点这里】</a>\n");
        keyWords.put("3",
                "亲爱滴：\n" +
                        "【手机绑定】<a href='"+ConstantParam.findRedUrl("sjbd")+"'>【请点这里】</a>\n");
        keyWords.put("【3】",
                "亲爱滴：\n" +
                        "【手机绑定】<a href='"+ConstantParam.findRedUrl("sjbd")+"'>【请点这里】</a>\n");
        keyWords.put("绑定",
                "亲爱滴：\n" +
                        "【手机绑定】<a href='"+ConstantParam.findRedUrl("sjbd")+"'>【请点这里】</a>\n");
        keyWords.put("绑定手机号",
                "亲爱滴：\n" +
                        "【手机绑定】<a href='"+ConstantParam.findRedUrl("sjbd")+"'>【请点这里】</a>\n");

        keyWords.put("【4】我的卡券包", "小主好，查看您的卡券包<a href='"+ConstantParam.findRedUrl("wdkqb")+"'>【请点这里】</a>\n");
        keyWords.put("4", "小主好，查看您的卡券包<a href='"+ConstantParam.findRedUrl("wdkqb")+"'>【请点这里】</a>\n");
        keyWords.put("【4】", "小主好，查看您的卡券包<a href='"+ConstantParam.findRedUrl("wdkqb")+"'>【请点这里】</a>\n");
        keyWords.put("我的卡券包", "小主好，查看您的卡券包<a href='"+ConstantParam.findRedUrl("wdkqb")+"'>【请点这里】</a>\n");
        keyWords.put("卡券包", "小主好，查看您的卡券包<a href='"+ConstantParam.findRedUrl("wdkqb")+"'>【请点这里】</a>\n");

        keyWords.put("【5】问题咨询", "小主好，问题咨询服务<a href='"+ConstantParam.findRedUrl("wtzx")+"'>【请点这里】</a>\n");
        keyWords.put("【5】", "小主好，问题咨询服务<a href='"+ConstantParam.findRedUrl("wtzx")+"'>【请点这里】</a>\n");
        keyWords.put("5", "小主好，问题咨询服务<a href='"+ConstantParam.findRedUrl("wtzx")+"'>【请点这里】</a>\n");
        keyWords.put("问题咨询", "小主好，问题咨询服务<a href='"+ConstantParam.findRedUrl("wtzx")+"'>【请点这里】</a>\n");
        keyWords.put("咨询", "小主好，问题咨询服务<a href='"+ConstantParam.findRedUrl("wtzx")+"'>【请点这里】</a>\n");
        keyWords.put("问题", "小主好，问题咨询服务<a href='"+ConstantParam.findRedUrl("wtzx")+"'>【请点这里】</a>\n");

        keyWords.put("【6】畅越/低消专区", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("【6】", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("6", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("畅越", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("低消", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("畅越/低消专区", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("畅越专区", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("低消专区", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");
        keyWords.put("专区", "办理畅越冰激凌、承诺低消送特权活动用户，特权兑换<a href='"+ConstantParam.findRedUrl("cydxzq")+"'>【请点这里】</a>\n");

        keyWords.put("权益", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("活动", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("优惠", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("特权", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
        keyWords.put("热门", "" +
                "热门权益<a href='"+ConstantParam.findRedUrl("rmqy")+"'>【请点这里】</a>\n" +
                "出行权益<a href='"+ConstantParam.findRedUrl("cxqy")+"'>【请点这里】</a>\n" +
                "影音权益<a href='"+ConstantParam.findRedUrl("yyqy")+"'>【请点这里】</a>\n" +
                "电商权益<a href='"+ConstantParam.findRedUrl("dsqy")+"'>【请点这里】</a>\n" +
                "金融权益<a href='"+ConstantParam.findRedUrl("jrqy")+"'>【请点这里】</a>");
    }
    public static String findRedirectUrl(String key){
        String res= redirectUrls.get(key);
        if(null == res || "".equals(res)){
            res=redirectUrls.get("991");
        }
        return res;
    }
    public static String findResponseText(String key){
        String res= keyWords.get(key);
        if(null == res || "".equals(res)){
            res=keyWords.get("else");
        }
        return res;
    }
    public static String findRedUrl(String key){

        String res= redUrls.get(key);
        if(null == res || "".equals(res)){
            res=redUrls.get("else");
        }
        return res;
    }
}
