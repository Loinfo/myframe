package org.cilion.myframe.util;

/**
 * @Auther: liangxin
 * @Date: 2018/11/2
 * @Description: 转型操作工具类
 */
public class CastUtil {

    /**
     * 转换为String类
     */
    public static String castString(Object obj){
        return CastUtil.castString(obj, "");
    }

    /**
     * 转为String 型（提供默认值）
     */
    public static String castString(Object obj, String defaultValue){
        return obj != null ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为double型
     */
    public static double castDouble(Object obj){
        return CastUtil.castDouble(obj, 0);
    }

    /**
     * 转为double型（提供默认值）
     */
    public static double castDouble(Object obj, double defaultValue){
        double doubleVale = defaultValue;
        if(null != obj){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    doubleVale = Double.parseDouble(strValue);
                }catch (NumberFormatException e){
                    doubleVale = defaultValue;
                }
            }
        }
        return doubleVale;
    }

    /**
     * 转为long型
     */
    public static long castLong(Object obj){
        return CastUtil.castLong(obj, 0);
    }

    /**
     * 转为long型（提供默认值）
     */
    public static long castLong(Object obj, long defaultValue){
        long longValue = defaultValue;
        if(null != obj){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    longValue = Long.parseLong(strValue);
                }catch (NumberFormatException e){
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     */
    public static int castInt(Object obj){
        return CastUtil.castInt(obj, 0);
    }

    /**
     * 转为int型（提供默认值）
     */
    public static int castInt(Object obj, int defaultValue){
        int intValue = defaultValue;
        if(null != obj){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    intValue = Integer.parseInt(strValue);
                }catch (NumberFormatException e){
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     */
    public static boolean castBoolean(Object obj){
        return CastUtil.castBoolean(obj, false);
    }

    /**
     * 转为boolean型（提供默认值）
     */
    public static boolean castBoolean(Object obj, boolean defaultValue){
        boolean intValue = defaultValue;
        if(null != obj){
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)){
                try {
                    intValue = Boolean.parseBoolean(strValue);
                }catch (NumberFormatException e){
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }
}
