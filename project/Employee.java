import java.io.*;

public class Employee
{
	
	String name;
	
	int age;
	
	String desc;
	
	double salary;
	
	// Employee类的构造器
	public Employee( String name ) 
	{
		this.name = name;
		System.out.println("我的名字是:"+this.name);
	}
	
	// 设置年龄
	public void setAge( int age )
	{
		this.age = age;
		System.out.println("我的年龄是:"+this.age);
	}
	
	
	// 设置简介
	public void setDesc( String desc )
	{
		this.desc = desc;	
		System.out.println("我的简介是："+desc);
	}
	
	// 设置工资
	public void setSalary( double salary )
	{
		salary *=  10;
		this.salary = salary;
		System.out.println("我的工资是:"+salary);
	}
	
	// 打印我的信息
	public void printMeInfo()
	{
		System.out.println("自我介绍，我的名字:"+ name );
		System.out.println("自我介绍，我的年龄:" + age );
		System.out.println("自我介绍，我的简介:" + desc );
		System.out.println("自我介绍，我的工资:" + salary);
	}
	
	
}