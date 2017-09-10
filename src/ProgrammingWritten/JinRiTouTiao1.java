package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/10.
 * 今日头条笔试1
 */
public class JinRiTouTiao1 {
    public static void main(String args[])
    {
       Scanner cin = new Scanner(System.in);

        int    n = cin.nextInt();  //串串数
        int    m = cin.nextInt();  //相邻多少
        int    c = cin.nextInt();  //颜色种类

        int index=0;
        int numi[]=new int [n];
        int arr[] [] =new int [n][c];
        while (index<n){
            numi[index]=cin.nextInt();

            int index1=0;
            while (index1<numi[index]){
                arr[index][index1]=cin.nextInt();
                index1++;
            }
            index++;

        }

       /*
       int n=5;
       int m=2;
       int c=3;
       int []numi={3,0,2,1,1};
       int arr[][]={{1,2,3},{0,0,0},{2,3,0},{2,0,0},{3,0,0}};
*/
        JRTT1(n,m,c,numi,arr);

    }

    public static void JRTT1(int n, int m,int c,int[] numi,int[][] arr){
        int count=0;

        for(int i=1;i<=c;i++){
            int res[] =new int [n];
            int temp=i;
            for(int j=0;j<n;j++){
                for(int k=0;k<c;k++){
                    if(arr[j][k]==temp){
                        res[j]=1;
                    }
                }
            }
            int cnt=1;
            for(int dex=1;dex<n;dex++){
                if(res[dex]==1&&res[dex]==res[dex-1]||res[0]==1&&res[n-1]==1){
                    cnt+=1;
                    if(cnt==m){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }

}
