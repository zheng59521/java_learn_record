public class VarClass
{
	
	private static int clicksNum=0;    // 类变量
 
    public String str="hello world";  // 实例变量

    public static final String DEPARTMENT = "开发人员"; // 常量
	
	
	public VarClass(String name, int age) 
	{
		System.out.println("我是构造方法， 我的名字："+name+"；我的岁数："+age);
		clicksNum += 1;
	}

	public static void main(String[] args)
	{
		
		// 单双引号区别：单引号为char，双引号是String
		System.out.println("============单双引号区别：单引号为char，双引号是String=============");
		char a = 'a';
		String aa = "aa";
		System.out.println("单引号为char a is："+a);
		System.out.println("双引号是String aa is："+aa);
		
		VarClass var1 = new VarClass("zjh", 16);
		
		
		// 数据类型转换
		System.out.println("============数据类型转换=============");
		
		// 自动类型转换这个例子是char先转为int再计算，char去ascii码表中获取对应的ascii，再与int类型相加
		System.out.println("============自动类型转换=============");
		char c1 = 'a';
		int i1 = c1;
		System.out.println("char转换为int："+i1);
		char c2 = 'A';//定义一个char类型
		int i2 = c2+1;//char 类型和 int 类型计算
		System.out.println("char类型和int计算后的值等于"+i2);
		
		// 强制类型转换
		System.out.println("============强制类型转换=============");
		int i11 = 123;
        byte b11 = (byte)i11;//强制类型转换为byte
        System.out.println("int强制类型转换为byte后的值等于"+b11);
		
		// 实例变量与常量的区别
		System.out.println("============实例变量与常量的区别=============");
		System.out.println("VarClass.clicksNum is:"+VarClass.clicksNum);
		VarClass v1 = new VarClass("a", 1);
		System.out.println("v1.clicksNum is："+v1.clicksNum);
		VarClass v2 = new VarClass("b", 2);
		System.out.println("v1.clicksNum is："+v2.clicksNum);
	}
	
	// 增加点击次数
	public void addClicks(int num)
	{
		this.clicksNum += num;
	}

}