public class VarClass
{
	
	public VarClass(String name, int age) 
	{
		
		System.out.println("我是构造方法， 我的名字："+name+"；我的岁数："+age);
		
	}

	public static void main(String[] args)
	{
		// 单双引号区别：单引号为char，双引号是String
		char a = 'a';
		String aa = "aa";
		System.out.println("单引号为char a is："+a);
		System.out.println("双引号是String aa is："+aa);
		
		VarClass var1 = new VarClass("zjh", 16);
		
	}

}