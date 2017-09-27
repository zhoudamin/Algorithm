package ProgrammingWritten;

/**
 * Created by zdmein on 2017/9/25.
 */
public class zhaoyinIT {
    public static void main(String [] args){
        System.out.println(CowNum(100));
    }

    public static int CowNum(int n){
        if(n==1){
            return 10;
        }
        return 3*CowNum(n-1)-2*(n-1);
    }
}
