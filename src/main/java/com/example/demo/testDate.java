package com.example.demo;

import java.util.Date;

import static com.example.demo.DateUtils.*;

public class testDate {
    public static void main(String[] args) {

        String strDate = "2013-01-01";

        Date date = parseDate(strDate);

        DateUtils.parseDate(new Date().toString(),"YYYY-MM-dd HH:mm:ss");
        /*System.out.println(strDate + " 今天是哪一年？" + getYear(date));
        System.out.println(strDate + " 今天是哪个月？" + getMonth(date));
        System.out.println(strDate + " 今天是几号？" + getDay(date));
        System.out.println(strDate + " 今天是周几？" + getWeekDay(date));
        System.out.println(strDate + " 是一年的第几周？" + getWeekOfYear(date));
        System.out.println(strDate + " 所在周起始结束日期？"
                + getWeekBeginAndEndDate(date, "yyyy年MM月dd日"));
        System.out.println(strDate + " 所在周周一是？"
                + formatDate(getMondayOfWeek(date)));
        System.out.println(strDate + " 所在周周日是？"
                + formatDate(getSundayOfWeek(date)));

        System.out.println(strDate + " 当月第一天日期？"
                + formatDate(getFirstDateOfMonth(date)));
        System.out.println(strDate + " 当月最后一天日期？"
                + formatDate(getLastDateOfMonth(date)));
        System.out.println(strDate + " 当月天数？" + getDayOfMonth(date));
        System.out.println(strDate + " 当月已过多少天？" + getPassDayOfMonth(date));
        System.out.println(strDate + " 当月剩余多少天？" + getRemainDayOfMonth(date));

        System.out.println(strDate + " 所在季度第一天日期？"
                + formatDate(getFirstDateOfSeason(date)));
        System.out.println(strDate + " 所在季度最后一天日期？"
                + formatDate(getLastDateOfSeason(date)));
        System.out.println(strDate + " 所在季度天数？" + getDayOfSeason(date));
        System.out.println(strDate + " 所在季度已过多少天？" + getPassDayOfSeason(date));
        System.out
                .println(strDate + " 所在季度剩余多少天？" + getRemainDayOfSeason(date));
        System.out.println(strDate + " 是第几季度？" + getSeason(date));
        System.out.println(strDate + " 所在季度月份？"
                + formatDate(getSeasonDate(date)[0], YYYYMMDDHHmmss) + "/"
                + formatDate(getSeasonDate(date)[1], YYYYMMDDHHmmss) + "/"
                + formatDate(getSeasonDate(date)[2], YYYYMMDDHHmmss));*/
       /* System.out.println(strDate + " 所在年份季度？"
                + formatDate(getSeasonDateOfYear(date)[0], YYYYMMDDHHmmss) + "/"
                + formatDate(getSeasonDateOfYear(date)[1], YYYYMMDDHHmmss) + "/"
                + formatDate(getSeasonDateOfYear(date)[2], YYYYMMDDHHmmss) + "/"
                + formatDate(getSeasonDateOfYear(date)[3], YYYYMMDDHHmmss) + "/"
                + formatDate(getSeasonDateOfYear(date)[4], YYYYMMDDHHmmss));*/
        /*System.out.println(formatDate(getFirstAndLastDateOfMonth(date)[0])+"/n"
                +formatDate(getFirstAndLastDateOfMonth(date)[1]));*/
    }
}
