package xiancheng;

/**
 * 我是一个新线程
 * 新线程创建之后，你调用它的 start() 方法它才会运行。
 */
class RunnableDemo implements Runnable {
    private Thread t;           // 一个线程对象
    private String threadName;  // 该线程的名称

    RunnableDemo( String name) {    // 构造方法
        threadName = name;
        System.out.println("新建线程 " +  threadName );
    }

    /**
     * 线程争抢,不按照start的调用顺序来执行
     * run相当于main主函数
     */
    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    /**
     * 调用虚拟机的run方法
     */
    public void start () {
        System.out.println("开始运行 " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}