package org.cilion.myframe.util;

/**
 * @Auther: liangxin
 * @Date: 2018/11/2
 * @Description:字符串工具类
 */
public class StringUtil {
    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str){
        if(null != str || "" != str){
            str = str.trim();
        }
        return StringUtil.isEmpty(str);
    }

    /**
     * 判断字符串是否为非空
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
}
