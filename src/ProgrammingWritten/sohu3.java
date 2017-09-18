package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/17.
 */
public class sohu3{
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        long [] a=new long [n];
        int i=0;
        while (i<n){
            a[i++]=cin.nextLong();
        }
        System.out.println(sohuhuiwen(a));
    }

    public static int [][]getDpmin(long []a){
        int [][]dp=new int [a.length][a.length];
        for(int j=1;j<a.length;j++){
            dp[j-1][j]=a[j-1]==a[j]?0:1;
            for(int i=j-2;i>-1;i--){
                if(a[i]==a[j]){
                    dp[i][j]=dp[i+1][j-1];
                }else {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j-1])+1;
                }
            }
        }
        return dp;
    }


    public static long sohuhuiwen(long [] a){

        if(a.length==1){
            return a[0];
        }
        if(a.length==2 && a[0]!=a[1]){
            return a[0]<a[1]?2*a[0]+a[1]:2*a[1]+a[0];
        }else if(a.length==2 && a[0]!=a[1]) {
            return a[0]*2;
        }

        int [][] dp=getDpmin(a);

        long [] res=new long [a.length+dp[0][a.length-1]];

        int i=0;
        int j=a.length-1;
        int resl=0;
        int resr=res.length-1;
        while(i<=j){
            if(a[i]==a[j]){
                res[resl++]=a[i++];
                res[resr--]=a[j--];
            }else if(dp[i][j-1]<dp[i+1][j]){
                res[resl++]=a[j];
                res[resr--]=a[j--];
            }else {
                res[resl++]=a[i];
                res[resr--]=a[i++];
            }

        }
        int sum=0;
        for(int k=0;k<res.length;k++){
            sum+=res[k];
        }

        return sum;
    }
}
