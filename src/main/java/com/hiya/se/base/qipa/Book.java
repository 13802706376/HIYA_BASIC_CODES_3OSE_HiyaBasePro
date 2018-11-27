package com.hiya.se.base.qipa;

public class Book
{
    private Integer id;
    private String name;

    public Book(Integer id, String name)
    {
        super();
        this.id = id;
        this.name = name;
        System.out.println("Book  by '" + id + "' is be created! ");
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    /**
     * JVM保证在一个对象所占用的内存被回收之前，如果它实现了finalize方法，则该方法一定会被调用。
     */
    @Override
    protected void finalize() throws java.lang.Throwable 
    {  
        super.finalize();  
        System.out.println("Book  by '" + id + "' is be killed! ");  
    }  
}
