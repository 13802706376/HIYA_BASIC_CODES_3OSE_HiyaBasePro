package com.hiya.se.base.qipa;

import static com.hiya.se.base.qipa.QipaExamUtil.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QipaExam
{

    public static void main(String[] args)
    {
        // 如果整型字面量的值在-128到127之间，那么不会new新的Integer对象，而是直接引用常量池中的Integer对象，所以上面的面试题中f1==f2的结果是true，而f3==f4的结果是false。
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);

        
        // Math.round(11.5)的返回值是12，Math.round(-11.5)的返回值是-11。四舍五入的原理是在参数上加0.5然后进行下取整
        System.out.println(Math.round(11.5));
        System.out.println(Math.round(-11.5));

        
        //在最外层循环前加一个标记如A:，然后用break A;可以跳出多重循环。
        twoCycle: for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5)
                {
                    break twoCycle;
                }
            }
        }
        
        
        //(1)如果两个对象相同（equals方法返回true），那么它们的hashCode值一定要相同；
        //(2)如果两个对象的hashCode相同，它们并不一定相同。
        String a1 = "ABC";
        String a2 = new String("ABC");
        System.out.println(a1 == a2);
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        
        
        //1 在方法体内对参数进行运算，不会影响原有变量的值（基本类型不会改变值，引用类型不会改变引用地址）。
        //2 在方法体内对参数的属性进行操作，将改变原有变量的属性值（如集合、数组、map中的元素）
        int a = 5;
        changeInt ( a);
        System.out.println(a);

        String  a3 = "x1";
        changeString ( a3);
        System.out.println(a3);
        
        int a4[] = {1,2,3};
        changeArray(a4);
        System.out.println(Arrays.toString(a4));
        
        changeArrayAttr(a4);
        System.out.println(Arrays.toString(a4));
        
        Book b5 = new Book(1005, "1005");
        changeOBject(b5);
        System.out.println(b5.getId()+"=="+b5.getName());
      
        changeOBjectAttr(b5);
        System.out.println(b5.getId()+"=="+b5.getName());
        
        Map<String,Object> x = new HashMap<>();
        x.put("id", "3");
        x.put("name", "Allen");
        changeMap(x);
        System.out.println(x);
        changeMapAttr(x);
        System.out.println(x);
        
        
        //String对象的intern方法会得到字符串对象在常量池中对应的版本的引用（如果常量池中有一个字符串与String对象的equals结果是true），
        //如果常量池中没有对应的字符串，则该字符串将被添加到常量池中，然后返回常量池中字符串的引用。
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
        
        /*
         * 在finally中改变返回值的做法是不好的，因为如果存在finally代码块，try中的return语句不会立马返回调用者，而是记录下返回值待finally代码块
         * 执行完毕之后再向调用者返回其值，然后如果在finally中修改了返回值，就会返回修改后的值。显然，在finally中返回或者修改返回值会对程序造
         * 成很大的困扰，C#中直接用编译错误的方式来阻止程序员干这种龌龊的事情，Java中也可以通过提升编译器的语法检查级别来产生警告或错误，
         * Eclipse中可以在如图所示的地方进行设置，强烈建议将此项设置为编译错误。
         * examTryFinally finally 
            3
         */
        System.out.println(examTryFinally());
        
        
        
       
        
            
        
        
    }

 
}
