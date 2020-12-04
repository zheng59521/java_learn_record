import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MyCollection {

    public static void main( String[] args ) {

        // 声明ArrayList并打印
        printArrayList();

        // 迭代器循环集合
        eachCollectMap();
    }

    /**
     * 声明ArrayList并打印
     */
    public static void printArrayList() {
        ArrayList<String> strArr = new ArrayList<String>();
        strArr.add("f");
        strArr.add("e");
        strArr.add("d");
        strArr.add("c");
        strArr.add("b");
        strArr.add("a");
        System.out.println(strArr);
        System.out.println("使用get访问数组列表元素"+strArr.get( strArr.size() - 1 ) );
        // 修改元素
        strArr.set(strArr.size() - 1, "aaa");
        System.out.println("使用set修改数组列表元素"+strArr.get( strArr.size() - 1 ) );
        // 删除元素
        strArr.remove( strArr.size() - 1 );
        System.out.println("使用remove删除数组列表元素最后一个后数组长度"+strArr.size()  );
        Collections.sort(strArr);
        System.out.println("使用Collections.sort排序数组列表"+ strArr  );

    }

    /**
     * 循环集合(MAP)
     */
    public static void eachCollectMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        //第一种：普遍使用，二次取值
//        System.out.println("通过Map.keySet遍历key和value：");
//        for (String key : map.keySet()) {
//            System.out.println("key= "+ key + " and value= " + map.get(key));
//        }

        //第二种
//        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
//        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
//        }

        //第三种：推荐，尤其是容量大时
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        //第四种
//        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
//        for (String v : map.values()) {
//            System.out.println("value= " + v);
//        }
    }

}
