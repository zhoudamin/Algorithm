package ClassicalAlgorithm;

/**
 * Created by zdmein on 2017/10/20.
 */
public class Test1 {
    public static void main(String args []){
        class A{
            public int i=3;
        }
        Object o=(Object) new A();
        A a=(A) o;
         System.out.println("i="+a.i);
    }
}
