import java.text.SimpleDateFormat;
import  java.util.*;

public class YunSuanFu {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        int [] num_arr = {10, 20, 30, 40};

        for ( int i: num_arr ) {
            if ( i == 20 ) continue;
            if ( i == 40 ) break;
            System.out.print( i );
        }

        char char1 = 'a';
        char[] char2 = {'a', 'b', 'c'};

        String str1 = Character.toString(char1) + "bbbb";
        String str2 = new String(char2);
        System.out.println("char1转字符串拼接bbb   = " +  str1 );
        System.out.println("char2转字符串  = " +  str2 );
        System.out.println("str1连接str2的两种方式  = " +  str1.concat(str2) +"==="+ (str1+str2) );

        // 数组作为参数是引用传递，在 doIt 方法中可以修改数组的值 。
        System.out.println("数组作为参数是引用传递，在 doIt 方法中可以修改数组的值 。");
        int[] myArray = {1, 2, 3, 4, 5};
        YunSuanFu.doIt(myArray);
        for (int j : myArray) {
            System.out.println(j + " ");
        }

        int[] arr = new int[9];
        System.out.println(arr[8]);

        // 当前格式化时间
        Date nowDate = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("当前格式化时间" + ft.format(nowDate));

        // 创建一个代表系统当前日期的Calendar对象
        System.out.println("创建一个代表系统当前日期的Calendar对象");
        Calendar ca = Calendar.getInstance();//默认是当前日期
        //将Calendar对象设置为代表2009年6月12日的
        ca.set(2009, 5, 12);
        ca.set(Calendar.HOUR_OF_DAY, 18);
        ca.set(Calendar.MINUTE, 10);
        ca.set(Calendar.SECOND, 22);

        System.out.println("将Calendar对象设置为代表2009年5月12日的"
                + ca.get(Calendar.YEAR)
                +"-"+ca.get(Calendar.MONTH)
                +"-"+ca.get(Calendar.DATE));
        ca.add(Calendar.DATE, 1);
        System.out.println("然后再加一天" + ca.get(Calendar.YEAR)
                +"-"+ca.get(Calendar.MONTH)
                +"-"+ca.get(Calendar.DATE));

    }

    static void doIt( int[] z )
    {
        int[] A = z;
        A[0] = 99;
    }

}
