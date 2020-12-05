package xiancheng;

/**
 * start方法正常顺序运行,
 * start之后的run方法,开始线程争抢
 */
public class TestThread {
    public static void main(String[] args) {

        RunnableDemo R1 = new RunnableDemo( "线程-1");
        RunnableDemo R2 = new RunnableDemo( "线程-2");
        R1.start();
        R2.start();

    }
}
