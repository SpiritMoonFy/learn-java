/**
 * Java程序基本格式及测试
 * @author moonspirit
 * @version 2016-7-3
 */

/**
 * Java程序基本格式
 * public class ClassName
 * {
 *     public static void main(String[] args)
 *     {
 *         program statements;
 *     }
 * }
 */

/**
 * 最标准Java程序格式
 * @author moonspirit
 * @version 2016-7-3
 */
/*
public class BaseTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}
*/

/**
 * 一个源文件不能有两个public class，此代码出错
 * @author moonspirit
 * @version 2016-7-3
 */
/*
public class BaseTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}
public class Test
{

}
*/

/**
 * 一个源文件可以没有public class
 * @author moonspirit
 * @version 2016-7-3
 */
/*
class BaseTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}
*/

/**
 * 源文件名应与主类名相同
 * @author moonspirit
 * @version 2016-7-3
 */
/*
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}
*/
class BaseTest
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
	}
}