package MultiThread;

/**
 * Created by zdmein on 2017/9/29.
 * 单例模式
 * 普通版
 */
public class Singleton1 {
    public static Singleton1 single=null;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(single==null){
            single=new Singleton1();
        }
        return single;
    }
}
