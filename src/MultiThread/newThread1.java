package MultiThread;

/**
 * Created by zdmein on 2017/9/25.
 */
public class newThread1 {
    public static void main(String [] args) {

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println(i);
                }
            }
        });
        thread.start();
    }

}
