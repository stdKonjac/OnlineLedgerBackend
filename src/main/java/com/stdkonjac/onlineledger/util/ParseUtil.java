package com.stdkonjac.onlineledger.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public static Date str2Date(String str) {
        if (str == null) {
            return null;
        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = sdf.parse(str);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return date;
        }
    }

    public static Timestamp str2Timestamp(String str) {
        return Timestamp.valueOf(str);
    }

    public static Timestamp date2Timestamp(Date date) {
        return new Timestamp(date.getTime());
    }

}
