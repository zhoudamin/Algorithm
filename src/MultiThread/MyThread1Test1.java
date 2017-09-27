package MultiThread;

/**
 * Created by zdmein on 2017/9/25.
 */
public class MyThread1Test1 {
    public static void main(String [] args){
        Thread t1=new MyThread1("线程A");
        Thread t2=new MyThread1("线程B");

        // t1.run();
        //  t2.run();
        t1.start();
        t2.start();
    }
}
