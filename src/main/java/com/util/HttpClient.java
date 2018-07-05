package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
public class HttpClient {

    public static String getAccessToken(String weiCurl) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(weiCurl);
            URLConnection theConnection = url.openConnection();
            if (!(theConnection instanceof HttpURLConnection)) {
                return "";
            }
            connection = (HttpURLConnection) theConnection;
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(7000);
            connection.setRequestProperty("Content-type",
                    "text/plain; charset=UTF-8");
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);
            connection.setRequestProperty("Connection", "closed");
            // connection.getOutputStream().write(reqMessage.getBytes("UTF-8"));
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
            }
            InputStream inputStream = connection.getInputStream();

            byte[] b = new byte[1024];
            int count = inputStream.read(b);
            byte[] bb = new byte[count];
            System.arraycopy(b, 0, bb, 0, count);
            String resultJson = new String(bb, "UTF-8");
//            JSONObject response = JSONObject.parseObject(resultJson);
//            String accessTokenTmp = response.getString("access_token");
            return resultJson;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

        return null;
    }
}
