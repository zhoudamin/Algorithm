package MultiThread;

/**
 * Created by zdmein on 2017/9/25.
 */
public class MyThread1 extends Thread {
    private String name;
    private int ticket=5;
    public MyThread1(String name){
        this.name=name;
    }

    public void run(){
        for(int i=0;i<10;i++){
            if(this.ticket>0){
                System.out.println("线程开始："+this.name+",卖票：i="+this.ticket--);
            }
        }
    }


}
