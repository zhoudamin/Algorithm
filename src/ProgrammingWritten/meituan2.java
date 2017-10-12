package ProgrammingWritten;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by zdmein on 2017/10/11.
 */
public class meituan2 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int mc = cin.nextInt();

        int [] num=new int [mc];
        int index = 0;

        while (index < mc) {
            num[index++] = cin.nextInt();
        }
        meituan22(num,n);
    }

    public static void meituan22(int [] num , int n ){
        int [] arr=new int [n+num.length];
        int [] arrnew=new int [n];
        for(int i=0;i<n;i++){
            arr[i+num.length]=i+1;
            arrnew[i]=i+1;
        }

        for(int j=0;j<num.length;j++){
            arr[num.length-j-1]=arrnew[num[j]-1];
        }

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                continue;
            }else {
                System.out.println(arr[i]);
                hm.put(arr[i],1);
            }
        }

    }

}
