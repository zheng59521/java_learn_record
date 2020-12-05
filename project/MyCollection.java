import java.util.*;

public class MyCollection {

    public static void main( String[] args ) {




        // 声明ArrayList并打印
//        printArrayList();

        // 迭代器循环集合
//        eachCollectMap();

        // 链表操作
//        linkedListOpera();

        // HashSet操作
//        hashSetOpera();

        // HashMap操作
//        hashMapOpera();

        // Iterator(迭代器)操作
//        iteratorOpera();
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


    /**
     * 链表操作
     */
    public static void linkedListOpera() {

        LinkedList<String> list = new LinkedList<String>();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("获取第一个"+list.getFirst());
        list.addLast("d");
        System.out.println("增加了最后一个"+list.getLast());
        list.removeLast();
        System.out.println("移除了最后一个"+list);

        for (String it: list) {
            System.out.println("循环输出"+it);
        }

    }


    /**
     * HashSet操作
     */
    public static void hashSetOpera() {
        HashSet<String> sites = new HashSet<String>();

        sites.add("a");
        sites.add("b");
        sites.add("c");
        System.out.println("判断元素a是否存在"+sites.contains("a"));
        sites.remove("c");
        System.out.println("删除了元素c,判断c是否存在:"+sites.contains("c"));
        System.out.println("元素总个数"+sites.size());

        for (String it: sites) {
            System.out.println("循环元素"+it);

        }

    }


    /**
     * HashMap操作
     */
    public static void hashMapOpera() {
        HashMap<Integer, String> sites = new HashMap<Integer, String>();

        sites.put(1, "a");
        sites.put(2, "b");
        sites.put(3, "c");
        System.out.println("哈希Map的值"+sites);
        System.out.println("获取2的值"+sites.get(2));
        sites.remove(3);
        System.out.println("删除3的值"+sites);
        System.out.println("哈希Map的长度"+sites.size());
        for ( Integer inx: sites.keySet() ) {
            System.out.println("key: " + inx + " value: " + sites.get(inx));
        }

        for ( Map.Entry<Integer, String> entry: sites.entrySet() ) {
            System.out.println("entry: " + entry );
        }

    }


    /**
     * Iterator迭代器操作
     */
    public static void iteratorOpera() {
        ArrayList<Character> list = new ArrayList<Character>();

        list.add('a');
        list.add('b');
        list.add('c');

        // 获取迭代器
        Iterator<Character> it = list.iterator();

        while ( it.hasNext() ) {
            Character c = it.next();
            it.remove();
            System.out.println("迭代元素："+c);
        }

        System.out.println("数组列表已被清空："+list);

    }





}
