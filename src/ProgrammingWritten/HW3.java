package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/20.
 */
public class HW3 {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        String num=cin.next();
        String n=cin.next();
        String m=cin.next();
        hw3(num,n,m);

    }

    public static void hw3(String num,String n,String m){
        if(num.length()<0){
            System.out.print("null");
            return;
        }
        int index=0;
        int [] flag=new int [num.length()];

        for(int i=num.length()-1;i>=0;i-- ){
            if(num.charAt(i)==n.charAt(0)){
                flag[num.length()-1-i]++;
                index++;
            }
        }

        int []wei=new int [index];
        int res=(int )Math.pow(2,index);
        int k=0;
        while (k<res){
            StringBuffer sb=new StringBuffer(num);
            char[] scc=num.toCharArray();
            String st=num;
            StringBuffer xx=new StringBuffer();
            int bb=0;
            for(int j=0;j<wei.length;j++) {
                while (flag[bb]==0){
                    bb++;
                }
                if (wei[j] != 0) {
                    while (flag[bb]==0){
                        bb++;
                    }
                      if(flag[bb]==1){
                          if(bb==0){
                              sb.replace(0,1,m);
                          }else if(bb==num.length()-1){
                              sb.replace(bb-1,bb,m);
                          }else {
                              sb.replace(bb-1,bb,m);
                          }




                }
                }
                bb++;
                }
              System.out.print(sb);
             if(k!=res-1){
                 System.out.print(",");
             }
            k++;
           if(wei[0]==0){
               wei[0]=1;
           }else {
               weiyunsuna(wei);
           }

             }


            }


public static void weiyunsuna(int [] wei){
         int i=0;
         while (i<wei.length&&wei[i]==1){
             wei[i++]=0;
         }
         if(i!=wei.length) {
             wei[i] = 1;
         }
}




    }


