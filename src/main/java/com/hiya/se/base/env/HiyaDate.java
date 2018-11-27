package com.hiya.se.base.env;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class HiyaDate
{
    // salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "开发人员";

    public static void main(String[] args)
    {
        java.util.Date date = new java.util.Date();
        // 如果希望得到YYYYMMDD的格式
        SimpleDateFormat sy1 = new SimpleDateFormat("yyyyMMdd");
        String dateFormat = sy1.format(date);
        // 如果希望分开得到年，月，日
        SimpleDateFormat sy = new SimpleDateFormat("yyyy");
        SimpleDateFormat sm = new SimpleDateFormat("MM");
        SimpleDateFormat sd = new SimpleDateFormat("dd");
        String syear = sy.format(date);
        String smon = sm.format(date);
        String sday = sd.format(date);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        Date date101 = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Current Date: " + ft.format(date101));

        // c的使用
        System.out.printf("全部日期和时间信息：%tc%n", date101);
        // f的使用
        System.out.printf("年-月-日格式：%tF%n", date101);
        // d的使用
        System.out.printf("月/日/年格式：%tD%n", date101);
        // r的使用
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date101);
        // t的使用
        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date101);
        // R的使用
        System.out.printf("HH:MM格式（24时制）：%tR", date101);

        SimpleDateFormat ft5 = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input + " Parses as ");
        Date t;
        try
        {
            t = ft5.parse(input);
            System.out.println(t);
        } catch (ParseException e)
        {
            System.out.println("Unparseable using " + ft5);
        }

        Calendar c1 = Calendar.getInstance();
        c1.set(2009, 6 - 1, 12);
        // 获得年份
        int year = c1.get(Calendar.YEAR);
        // 获得月份
        int month = c1.get(Calendar.MONTH) + 1;
        // 获得日期
        int date103 = c1.get(Calendar.DATE);
        // 获得小时
        int hour = c1.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = c1.get(Calendar.MINUTE);
        // 获得秒
        int second = c1.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = c1.get(Calendar.DAY_OF_WEEK);

        String months[] =
        { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        int year106;
        // 初始化 Gregorian 日历
        // 使用当前时间和日期
        // 默认为本地时间和时区
        GregorianCalendar gcalendar = new GregorianCalendar();
        // 显示当前时间和日期的信息
        System.out.print("Date: ");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
        System.out.println(year106 = gcalendar.get(Calendar.YEAR));
        System.out.print("Time: ");
        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        // 测试当前年份是否为闰年
        if (gcalendar.isLeapYear(year106))
        {
            System.out.println("当前年份是闰年");
        } else
        {
            System.out.println("当前年份不是闰年");
        }

    }

}
