import java.util.ArrayList;
import java.util.List;

public class FanXing<T> {

    private T t;

    public void add( T t ) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main( String[] args ) {

        System.out.println("泛型方法");


        // 使用泛型方法打印不同字符串的元素
        System.out.println("泛型方法：使用泛型方法打印不同字符串的元素");
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        printAnyArray( intArray, doubleArray, charArray  );

        System.out.println("泛型方法：限制被传递到一个类型参数的类型种类范围");
        // 限制被传递到一个类型参数的类型种类范围
        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );
        // =======================


        // 泛型类的情况
        System.out.println("泛型类的情况：");

        FanXing<Integer> integerBox = new FanXing<Integer>();
        FanXing<String> stringBox = new FanXing<String>();

        integerBox.add(10);
        stringBox.add("菜鸟教程");

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
        // =======================

        // 类型通配符：类型通配符一般是使用?代替具体的类型参数
        // 例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类。
        System.out.println("类型通配符：");
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }

    /**
     * 接受多个泛型数组并打印
     * <E> args
     * tip: printAnyArray 来自于参数化可变参数类型的可能的堆污染,所以增加@SafeVarargs
     */
    @SafeVarargs
    public static <E> void printAnyArray(E[] ...args ) {
        for ( E[] arr: args ) {
            for ( E it: arr ) {
                System.out.println("整型数组元素为"+it);
            }
        }
    }

    /**
     * 比较三个值并返回最大值
     * T x
     * T y
     * T z
     * Comparable <T>
     * return T
     */
    public static <T extends Comparable<T>> T maximum(T x, T y, T z)
    {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }

    /**
     * 不知道List(列表内)具体的数据类型
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

}
