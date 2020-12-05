package xiancheng.ThreadDemo;

public class TestThread {
    public static void main(String[] args) {
        ThreadDemo T1 = new ThreadDemo( "线程-1");
        ThreadDemo T2 = new ThreadDemo( "线程-2");
        T1.start();
        T2.start();
    }
}
