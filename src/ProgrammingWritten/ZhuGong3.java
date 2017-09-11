package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/11.
 * 排好序的1——n个数，当至少还有2个数时，丢掉第一个数，把新的第一个数移到最后面
 *例子

 1 2 3 4 5
 3  4  5  2
 5  2  4
 4  2
 2

 */
public class ZhuGong3 {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int [] arr=new int [n*2];
        for(int i=1;i<=n;i++){
            arr[i]=i;
        }

        System.out.println(lastnum(n,arr));

    }

    public static int lastnum(int n,int [] arr){
        if(n<1){
            return 0;
        }

        int index=0;
        for(int i=1;arr[i]!=0;i++){
            if(arr[i+1]!=0&&arr[i+2]!=0){
                arr[n+1]=arr[i+1];
                n++;
                i++;
            }else if(arr[i+1]!=0&&arr[i+2]==0){
                return arr[i+1];
            }
            index=i;
        }
        return arr[index];
    }
}
