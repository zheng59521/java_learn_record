package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Fun {

    public static void main( String ...args ) {
        String[] arr = {"aaa","bbb"};
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("女,小红", "男,小明"));

        BinaryOperator<Integer> cal = (a, b) -> a + b;
        System.out.println(cal.apply(1, 2));

        // 直接调用匿名函数
        Consumer<String[]> p = (String[] a) -> Arrays.asList(a).forEach( e -> System.out.println("e is "+e) );
        p.accept(arr);

        // 通过函数调用匿名函数
        pp1(list1, it -> System.out.println( "名字是"+it.toString().split(",")[1] ) );
        pp2(arr, it -> Arrays.asList(it).forEach(e -> System.out.println(e)) );
    }
    // 方法体为循环调用匿名函数
    public static void pp1(ArrayList<String> arr, Consumer<Object> con1){
        for ( Object it: arr ) con1.accept(it);
    }
    // 方法体为直接调用匿名函数
    public static void pp2(String[] arr, Consumer<String[]> con1){
        con1.accept(arr);
    }
}

