package ProgrammingWritten;


import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/16.
 */
public class NetCC1 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int x = cin.nextInt();
            int y = cin.nextInt();
            int z = cin.nextInt();
            int start = cin.nextInt();
            int end = cin.nextInt();
            System.out.println(minCount(x,y,z,start,end));
        }

        public static int minCount(int x, int y, int z,int start, int end) {
            int sum = end-start;
            int hot=start;
            int cc=0;

            while (hot<sum){
                //乘的情况
                if(hot*2<=sum){
                    //送礼
                    if(hot*2 > (y/x)*2 ){
                        hot+=start*2;
                        cc+=y;
                    }else {
                        hot+=(y/x)*2;
                        cc+=x*start*2/2;
                    }
                }else if(hot*2>sum){   //减cc的情况
                    if((hot*2-sum)*z+y> x*sum/2){
                        hot=sum;
                        cc+=x*sum/2;
                    }else {
                        hot=sum;
                        cc+=(start*2-sum)*z+y;
                    }
                }
            }
            return cc;
        }
}
