package MultiThread;

/**
 * Created by zdmein on 2017/9/25.
 */
public class MyRunnable1Test {
    public static void main(String [] args){
        Runnable r=new MyRunnable1();
        Thread t1=new Thread(r,"线程A");
        Thread t2=new Thread(r,"线程B");

        t1.start();
        t2.start();

    }
}
