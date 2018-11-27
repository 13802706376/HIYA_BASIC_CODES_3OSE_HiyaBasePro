package com.hiya.se.base.env;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Miscellaneous @link String utility methods.
 *
 * <p>Mainly for internal use within the framework; consider
 * <a href="http://commons.apache.org/proper/commons-lang/">Apache's Commons Lang</a>
 * for a more comprehensive suite of @code Stringutilities.
 *
 * <p>This class delivers some simple functionality that should really be
 * provided by the core Java @link String and @link StringBuilder
 * classes. It also provides easy-to-use methods to convert between
 * delimited strings, such as CSV strings, and collections and arrays.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @author Keith Donald
 * @author Rob Harrop
 * @author Rick Evans
 * @author Arjen Poutsma
 * @author Sam Brannen
 * @author Brian Clozel
 * @since 16 April 2001
 */
public class HiyaJavadoc
{

    /**
    * @since 1.8
    */
    private void since()
    {
         //@since 从以下版本开始，一般用于标记文件创建时项目当时对应的版本，一般后面跟版本号，也可以跟是一个时间，表示文件当前创建的时间
    }
    
    /**
     * @link java.lang.Character
     */
    private void link()
    {
        //{@link 包名.类名#方法名(参数类型)} 用于快速链接到相关代码
    }
    
    /**
     * for a more comprehensive suite of @code String utilities.
     */
    private void code()
    {
        //{@code text} 将文本标记为code ,{@code text} 会被解析成<code> text </code>
    }
    
    /**
    *  @param <E> the type of elements in this list
     * @return 
    */
    private  <E extends Collection>  void  param()
    {
        // param, 一般类中支持泛型时会通过@param来解释泛型的类型
    }
    
    /**
     * @author Rod Johnson
     * @author <a href="https://jakarta.apache.org/turbine"> Apache Jakarta Turbine</a>
     */
    private void author()
    {
        // 详细描述后面一般使用@author来标记作者，如果一个文件有多个作者来维护就标记多个@author，@author 后面可以跟作者姓名(也可以附带邮箱地址)、组织名称(也可以附带组织官网地址)
    }
    
    /**
     * @see IntStream
     * @see LongStream
     */
    private void see()
    {
        // @see 一般用于标记该类相关联的类,@see即可以用在类上，也可以用在方法上
    }
    
    /**
     * Decode the given encoded URI component value. Based on the following rules:
     * <ul>
     * <li>Alphanumeric characters {@code "a"} through {@code "z"}, {@code "A"} through {@code "Z"},
     * and {@code "0"} through {@code "9"} stay the same.</li>
     * <li>Special characters {@code "-"}, {@code "_"}, {@code "."}, and {@code "*"} stay the same.</li>
     * <li>A sequence "{@code %<i>xy</i>}" is interpreted as a hexadecimal representation of the character.</li>
     * </ul>
     * 
     * @param source the encoded String
     * @param charset the character set
     * @return the decoded value
     * @throws IllegalArgumentException when the given source contains invalid encoded sequences
     * @since 5.0
     * @see java.net.URLDecoder#decode(String, String)
     */
    public static String uriDecode(String source, Charset charset) 
    {
        return source;
    }
    
    public static void main(String[] args)
    {
        
    }
}
