package com.deal.mrzhang.deal.api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");

    public static Date transFormate(Date date) throws ParseException {
        String format1 = DateUtils.format.format(date);
        final Date parse = format.parse(format1);
        return parse;
    }

    public static String getSting(Date date) {
        return sdf1.format(date);
    }

    public static Date getDateFromStr(String str) throws ParseException {
        StringBuilder sb = new StringBuilder();
        if (str.length() == 6) {
            sb.append(str, 0, 4).append("-").append(str.substring(4)).append("-").append("00");
            return format.parse(sb.toString());
        } else {
            return format.parse(str);
        }
    }


    /**
     * 执行导出操作的时候，对应的时间输入格式的处理操作的
     * */
    public static Date DateTrim(Date date){
        return new Date();
    }
}
