package com.stdkonjac.onlineledger.util;

import com.stdkonjac.onlineledger.util.DateUtil;

import java.util.Date;

public class ParseUtil {
    public static Integer str2Int(String str) {
        if (str == null) {
            return null;
        } else {
            return Integer.parseInt(str);
        }
    }

    public static Double str2Double(String str) {
        if (str == null) {
            return null;
        } else {
            return Double.parseDouble(str);
        }
    }

    public static Date str2Date(String str, String pattern) {
        if (str == null) {
            return null;
        } else {
            return DateUtil.str2Date(str, pattern);
        }
    }
}
