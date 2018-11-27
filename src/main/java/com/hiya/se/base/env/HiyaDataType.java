package com.hiya.se.base.env;

public class HiyaDataType
{

    final int value = 10;
    // 下面是声明常量的实例
    public static final int BOXWIDTH = 6;
    static final String TITLE = "Manager";

    public void changeValue()
    {
        // value = 12; //将输出一个错误
    }
    
    public static void main(String[] args)
    {
        // byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

        
        char a = '\u0001';
        String a2 = "\u0001";
        
        String a4 = "Hello World";
        String a5 =  "two\nlines\r";
        String a6 = "\"This is in quotes\"";
        
        System.out.printf("a=%s,b=%s,c=%s",a4,a5,a6);
        
        
        
        char c1='a';//定义一个char类型
        int i1 = c1;//char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于"+i1);
        char c2 = 'A';//定义一个char类型
        int i2 = c2+1;//char 类型和 int 类型计算
        System.out.println("char类型和int计算后的值等于"+i2);
        
        int i11 = 123;
        byte b = (byte)i11;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b);
        
        
        
        String s = "1";
        byte b5 = Byte.parseByte( s );
        short t = Short.parseShort( s );
        int i = Integer.parseInt( s );
        long l = Long.parseLong( s );
        Float f = Float.parseFloat( s );
        Double d = Double.parseDouble( s );
        
        

        
        int a102 = 10;
        int b102 = 20;
        int c102 = 25;
        int d102 = 25;
        System.out.println("a + b = " + (a102 + b102) );
        System.out.println("a - b = " + (a102 - b102) );
        System.out.println("a * b = " + (a102 * b102) );
        System.out.println("b / a = " + (b102 / a102) );
        System.out.println("b % a = " + (b102 % a102) );
        System.out.println("c % a = " + (c102 % a102) );
        System.out.println("a++   = " +  (a102++) );
        System.out.println("a--   = " +  (a102--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d102++) );
        System.out.println("++d   = " +  (++d102) );
        
        
        
        System.out.println("a == b = " + (a102 == b102) );
        System.out.println("a != b = " + (a102 != b102) );
        System.out.println("a > b = " + (a102 > b102) );
        System.out.println("a < b = " + (a102 < b102) );
        System.out.println("b >= a = " + (b102 >= a102) );
        System.out.println("b <= a = " + (b102 <= a102) );
        
        
        c102 = a102 & b102;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c102 );
    
        c102 = a102 | b102;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c102 );
    
        c102 = a102 ^ b102;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c102 );
    
        c102 = ~a102;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c102 );
    
        c102 = a102 << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c102 );
    
        c102 = a102 >> 2;     /* 15 = 1111 */
        System.out.println("a >> 2  = " + c102 );
     
        c102 = a102 >>> 2;     /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + c102 );
        
        
        
        boolean a101 = true;
        boolean b101 = false;
        System.out.println("a && b = " + (a101&&b101));
        System.out.println("a || b = " + (a101||b101) );
        System.out.println("!(a && b) = " + !(a101 && b101));
        
        
        c102 = a102 + b102;
        System.out.println("c = a + b = " + c102 );
        c102 += a102 ;
        System.out.println("c += a  = " + c102 );
        c102 -= a102 ;
        System.out.println("c -= a = " + c102 );
        c102 *= a102 ;
        System.out.println("c *= a = " + c102 );
        a102 = 10;
        c102 = 15;
        c102 /= a102 ;
        System.out.println("c /= a = " + c102 );
        a102 = 10;
        c102 = 15;
        c102 %= a102 ;
        System.out.println("c %= a  = " + c102 );
        c102 <<= 2 ;
        System.out.println("c <<= 2 = " + c102 );
        c102 >>= 2 ;
        System.out.println("c >>= 2 = " + c102 );
        c102 >>= 2 ;
        System.out.println("c >>= a = " + c102 );
        c102 &= a102 ;
        System.out.println("c &= 2  = " + c102 );
        c102 ^= a102 ;
        System.out.println("c ^= a   = " + c102 );
        c102 |= a102 ;
        System.out.println("c |= a   = " + c102 );
        
        
        
        
        
        
        
        
    }

}
