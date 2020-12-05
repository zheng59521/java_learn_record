import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。
 * 该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。
 */
public class Fun {

    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1, 2, 3);

        System.out.println("输出所有数据:");

        eval(list, n->true);


        System.out.println("输出所有偶数:");
        eval(list, n-> n%2 == 0 );

        List<Integer> list2 = Arrays.asList(4, 5, 6);


        mangerArray(list, list2);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }

    /**
     * 合并多个数组值
     * List<E> ...args
     */
    public static <E> void mangerArray( List<E> ...args ) {
        List<Integer> mangeArr = new ArrayList<Integer>();
        for (List<E> arr: args ) {
            System.out.println("arr is:"+arr);
            for (E it: arr ) {
                System.out.println("it is:"+it);
                mangeArr.add((Integer)it);
            }
        }
        System.out.println("mangeArr is:"+mangeArr);
    }

}
