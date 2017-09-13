package ProgrammingWritten;
import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/13.
 * 腾讯笔试题
 *
 * a  b   A   B
 * 只有2中操作
 *    *2
 *    +1
 *    让 a  b  变成  A  B
 */
public class tenxun2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            int A = input.nextInt();
            int B = input.nextInt();
            System.out.println(minCount(a,b,A,B));

        }

        private static int minCount(int a, int b, int a2, int b2) {
            int count = 0;
            if(a2%2==0&&b2%2==1 || a2%2==1&&b2%2==0){ //后面两个数a2、b2，如果一奇一偶，则只能通过加法实现
                if(a2-a==b2-b){
                    count = a2-a;
                    return count;
                }
            }else{  //a2、b2同奇同偶情况
                while(a<a2&&b<b2){
                    if(a2%2==0&&a2/2>=a){ //为偶能除则除
                        a2=a2/2;
                        b2=b2/2;
                        count++;
                    }else if(a2%2==0){   //不能除后续只能全做减法
                        if(a2-a==b2-b){
                            count+=a2-a;
                            a=a2;
                            b=b2;
                        }else{
                            return -1;
                        }
                    }else if(a2%2==1){  //为奇数则先做减法变偶数
                        a2--;
                        b2--;
                        count++;
                    }
                }
                if(a==a2&&b==b2){
                    return count;
                }
            }
            return -1;
        }
}
