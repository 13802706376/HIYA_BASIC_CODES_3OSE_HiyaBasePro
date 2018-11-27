package com.hiya.se.base.env;

import java.util.Scanner;

import com.hiya.se.base.qipa.Book;

public class HiyaSystem
{

    public static void main(String[] args)
    {
        hiyaGc();
        hiyaScanner();
    }

    private static void hiyaGc()
    {
        Book c1 = new Book(1, "name");
        Book c2 = new Book(2, "name");
        Book c3 = new Book(3, "name");
        c2 = c3 = null;
        System.gc(); // 调用Java垃圾收集器
    }
    
    private static void hiyaScanner()
    {
        Scanner scan = new Scanner(System.in);

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext())
        {
            String str1 = scan.next();
            String str2 = scan.nextLine();
            System.out.println("输入的数据为：" + str1);
        }
        System.out.print("输入整数：");
        int i = 0;
        float f = 0.0f;
        if (scan.hasNextInt())
        {
            // 判断输入的是否是整数
            i = scan.nextInt();
            // 接收整数
            System.out.println("整数数据：" + i);
        } 
        else
        {
            // 输入错误的信息
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat())
        {
            // 判断输入的是否是小数
            f = scan.nextFloat();
            // 接收小数
            System.out.println("小数数据：" + f);
        } 
        else
        {
            // 输入错误的信息
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }
}
