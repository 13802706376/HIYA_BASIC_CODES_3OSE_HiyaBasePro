package com.hiya.se.base.qipa;

import java.util.HashMap;
import java.util.Map;

public class QipaExamUtil
{
    
    public static void changeInt( int x) 
    {
       x = 777;
    }
    
    public static void changeString( String x) 
    {
       x = "swapStringX";
    }
    
    public static void changeArray( int[] x) 
    {
        int x1[] = {11,12,13};
        x = x1;
    }
    
    public static void changeArrayAttr( int[] x) 
    {
       x[0] = 456;
       x[1] = 789;
    }
    
    public static void changeOBject( Book x) 
    {
       x = new Book(100, "swapOBjectx");
    }
    
    public static void changeOBjectAttr( Book x) 
    {
      x.setId(4444);
      x.setName("4444");
    }
    
    public static void changeMap( Map<String,Object> x) 
    {
       x = new HashMap<>();
       x.put("key002", "43242");
    }
    
    public static void changeMapAttr( Map<String,Object> x) 
    {
        x.put("name", "wadee");
        x.put("key001", "eqw");
    }
    
    @SuppressWarnings({ "unused", "finally" })
    public static int examTryFinally()
    {
        int x = 0;
        try
        {
            int ff = 5 +x;
            return 1;
        } catch (Exception e)
        {
            return 2;
        } finally
        {
            System.out.println("examTryFinally finally ");
            return 3;
        }
    }
}
