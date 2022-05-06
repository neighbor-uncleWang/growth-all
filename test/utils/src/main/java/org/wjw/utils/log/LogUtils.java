package org.wjw.utils.log;

/**
 * @author wjw
 * @ClassName LogUtils.java
 * @createTime 2022-05-06 20:48
 */
public class LogUtils {

    /**
     * 模板格式：===========str===========
     *
     * @param str
     * @return
     */
    public static String buildStrLogTemplate(String str) {

        return "===========" + str + "===========";
    }
}
