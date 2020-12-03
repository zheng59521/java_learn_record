public class Puppy
{
	// 年龄
	int puppyAge;
	
	public Puppy(String name)
	{
	  // 这个构造器仅有一个参数：name
	  System.out.println("小狗的名字是 : " + name ); 
	}
   
	/**
	* 设置年龄
	*/
	public void setAge( int age ){
	   puppyAge = age;
	}

	/**
	* 获取年龄
	*/
	public int getAge( ){
	   System.out.println("小狗的年龄为 : " + puppyAge ); 
	   return puppyAge;
	}

	/**
	* 入口函数
	*/
	public static void main(String[] args)
	{
		// 实例化
		Puppy myPuppy = new Puppy( "tommy" );
		// 设置年龄
		myPuppy.setAge(19);
		/* 调用另一个方法获取age */
		myPuppy.getAge( );
		/* 访问成员变量 */
		System.out.println("变量值 : " + myPuppy.puppyAge ); 
	}
}