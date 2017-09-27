package MultiThread;

/**
 * Created by zdmein on 2017/9/25.
 */
public class MyRunnable1 implements Runnable {
    private int ticket=5;

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            if(this.ticket>0){
                System.out.println("线程开始："+Thread.currentThread().getName()+",卖票：i="+this.ticket--);
            }
        }
    }

}
