package com.hiya.se.base.env;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class HiyaString
{

    public static void main(String[] args)
    {
        String str = "wade399|rrrr";
        
        //返回索引为2的char值
        char charAt = str.charAt(2);
        System.out.println(charAt);
        
        //返回索引为2的Unicode
        int codePointAt = str.codePointAt(2);
        System.out.println(codePointAt);
        
        /*
         * 与另一个字符窜按照字典顺序比较
         * 等于0：两个字符串完全相等
         * 大于0：前面的在后面的之前
         * 小于0：前面的在后面的之后
         */
        int compareTo = str.compareTo("wade399");
        System.out.println(compareTo);
        System.out.println(str.compareTo("Wade399"));
        System.out.println(str.compareTo("3ade399"));
        System.out.println(str.compareTo("yade399"));
        System.out.println(str.compareToIgnoreCase("WADE399"));
        
        //在字符串结尾处加上字符串
        System.out.println(str.concat("10"));
        
        //与一个StringBuffer比较是否相等
        System.out.println(str.contentEquals(new StringBuffer("waDe399")));
        
        //测试该字符串是否以"64"结尾
        System.out.println(str.endsWith("64"));
        
        //测试该字符串是否与另一字符串内容相等
        System.out.println(str.equals("wade388"));
        System.out.println(str.equalsIgnoreCase("wade388"));
        
        //测试该字符串是否与另一字符串地址相等
        System.out.println(str=="wade399");
        
        //不计较大小写，是否与另一字符串内容相等
        System.out.println(str.equalsIgnoreCase("WADE399"));
        
        //使用默认字符集将此字符串编码为byte序列并将结果存储到一个新的byte数组中
        byte getBytes[] = str.getBytes();
        System.out.println(getBytes[0]+";"+getBytes[1]+";"+getBytes[2]);
        
        //返回次字符串的哈希吗
        int hashCode = str.hashCode();
        System.out.println(hashCode);
        
        /*
         * 返回指定字符在此字符或字符串中第一次出现的索引，没有出现为-1
         * str.indexOf("r",1)表示从指定的索引开始收索
         */
        int indexOf = str.indexOf("r");
        System.out.println(indexOf);
        System.out.println(str.indexOf('w'));
        System.out.println(str.indexOf("r",1));
        str.endsWith("r");
        str.startsWith("fff");
        
        //返回长度
        System.out.println(str.length());
        
        //此字符串是否匹配该正则表达式，正则表达式不必出现/^$/等字样
        System.out.println(str.matches("[url=file://\\d]\\d[/url]+"));
        
        /*
         * 通过用newChar替换此字符串中出现的所有oldChar得到的新字符串
         * replaceFirst表示替换首次出现的旧字符串，并非所有的
         */
        System.out.println(str.replace("399", "444"));
        System.out.println(str.replace("9", "8"));
        System.out.println(str.replaceFirst("9", "8"));
        
        /*
         * 根据给定正则表达式的匹配拆分此字符串
         * split("[url=file://\\+|\\-|\\*|\\/]\\+|\\-|\\*|\\/[/url]"):按照"+"或"-"或"*"或"/"把字符串切成块状
         */
        String []split = str.split("\\|");
        System.out.println(split[0]+";"+split[1]);
        System.out.println(str.split("[url=file://\\+|\\-|\\*|\\/]\\+|\\-|\\*|\\/[/url]"));

        //测试该字符串是否以"r"开始
        System.out.println(str.startsWith("r"));
        
        /*
         * 按照规则截取字符串
         * substring(1)：从索引为1处开始到结束
         * substring(1,3)：从索引为1处到3处组成的新字符串
         */
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,3));
        
        //返回char类型的数组
        char toCharArray[] = str.toCharArray();
        System.out.println(toCharArray);
        
        //返回String形式
        System.out.println(str.toString());
        
        //返回字符串的小写形式
        System.out.println(str.toLowerCase());
        
        //返回字符串的大写形式
        System.out.println(str.toUpperCase());
        
        //去掉前后空格
        System.out.println(str.trim());
        
        /*
         * 返回基本数据类型的String类型
         * String.valueOf(44)效果相当于：new Integer(44).toString()
         * 基本数据类型包括int，long，float，double，short，char，byte
         */
        int i = 99;
        String valueOf = String.valueOf(i);
        System.out.println(valueOf);
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(55.7F));
        System.out.println(String.valueOf(444.6));
        System.out.println(String.valueOf(8888L));
        
        char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);  
        System.out.println( helloString );
        
        //和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
        //StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);  
        
        
 
       
    }

}
