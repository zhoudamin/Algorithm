/**
 * Created by Administrator on 2017/8/10.
 */
public class CircleDynamic {
    public static void main(String [] args){
        int [] m= {1,-2,3,5,-2,6,-1};
        maxSum(m);

    }

    public static void maxSum(int[] m){
        if(m.length==0){
            return;
        }
        int cur=0;
        int max=0;
        for(int i=0;i<m.length;i++){
            cur+=m[i];
            if(max<cur){
                max=cur;
            }
            if(cur<0){
                cur=0;
            }
        }
        System.out.println(max);

    }
}


