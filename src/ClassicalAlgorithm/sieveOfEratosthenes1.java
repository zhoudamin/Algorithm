package ClassicalAlgorithm;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/11.
 * 生成素数序列：埃拉图斯特尼筛法
 * 高效生成素数
 */
public class sieveOfEratosthenes1 {
    public static void main(String [ ] args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        boolean [] flags=sieveOfEratosthenes(n);
        for(int i=0;i<=n;i++){
            if(flags[i]==true){
                System.out.println(i);
            }
        }
    }

    public static boolean [] sieveOfEratosthenes(int n){
        boolean [] flag=new boolean[n+1];
        int count=0;

        flag[2]=true;
        for(int i=3;i<n;i+=2){
            flag[i]=true;
        }

        int prime=3;
        while (prime<n){
            crossOff(prime,flag);
            prime=getNextPrime(flag,prime);
            if(prime>=flag.length){
                break;
            }
        }
        return flag;
    }

    public static void crossOff(int prime,boolean[] flag){
        for(int j=prime*prime;j<flag.length;j++){
            flag[j]=false;
        }
    }

    public static int getNextPrime(boolean [] flag ,int prime){
        int next=prime+1;
        if(next<flag.length&&!flag[next]){
            next++;
        }
        return next;
    }

}
