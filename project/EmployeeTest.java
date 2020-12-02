import java.io.*;

public class EmployeeTest
{
	
	public static void main( String[] args ) 
	{
		// 使用构造器创建两个对象
		Employee empOne = new Employee("USER1");
		Employee emp2 = new Employee("USER2");
		empOne.setAge(26);
		empOne.setDesc("高级程序员");
		empOne.setSalary(1000);
		empOne.printMeInfo();
		
		emp2.setAge(26);
		emp2.setDesc("初级程序员");
		emp2.setSalary(500);
		emp2.printMeInfo();
	}
	
}