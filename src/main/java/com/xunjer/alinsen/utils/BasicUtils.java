package com.xunjer.alinsen.utils;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * @author linsen
 * @date 2020/3/15 21:02
 * @tips 明日复明日 明日何其多
 */
public class BasicUtils {

    private static MessageDigest md5 = null;
    static {
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 生成唯一的UUID字符串
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-","");
    }

    /**
     * 生成唯一的MD5值
     * @param s
     * @return
     */
    public static String getMD5(String s){
        byte[] bs = md5.digest(s.getBytes());
        StringBuilder sb = new StringBuilder(40);
        for(byte x:bs) {
            if((x & 0xff)>>4 == 0) {
                sb.append("0").append(Integer.toHexString(x & 0xff));
            } else {
                sb.append(Integer.toHexString(x & 0xff));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String a= getMD5("value");
        System.out.println(a);
        System.out.println(a.equals("2063c1608d6e0baf80249c42e2be5804"));
    }
}
