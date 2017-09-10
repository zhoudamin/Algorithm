package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/10.
 * 今日头条笔试2
 */
public class JinRiTouTiao2 {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

        int    n = cin.nextInt();
        int [] perfer=new int [n];
        int index=0;
        while (index<n){
            perfer[index]=cin.nextInt();
            index++;
        }
        int mLine=cin.nextInt();
        index=0;
        int [] left=new int[mLine];
        int [] right=new int[mLine];
        int [] perfernum=new int[mLine];
        while (index<mLine){
            left[index]=cin.nextInt();
            right[index]=cin.nextInt();
            perfernum[index]=cin.nextInt();
            index++;
        }
        JRTT2(n,perfer,left,mLine,right,perfernum);

    }

    public static void JRTT2(int n,int []perfer,int []left,int mLine ,int[] right,int [] perfernum ){
        int count[]=new int [mLine];
        for(int i=0;i<mLine;i++){
            for(int j=left[i]-1;j<right[i];j++){
                if(perfer[j]==perfernum[i]){
                    count[i]++;
                }
            }
        }
        for(int i=0;i<mLine;i++){
            System.out.println(count[i]);
        }

    }

}
