package ProgrammingWritten;

import java.util.Scanner;
/**
 * Created by zdmein on 2017/9/14.
 * 数字合并，然后输出能被7整除的个数
 * 3
 127
 1996
 12
 组合  1271996  199612 ...
 4
 */
public class meituan1 {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int index = 0;
        int arr [] = new int[n];
        while (index < n) {
            arr[index++] = cin.nextInt();
        }
        System.out.println(meituan(n,arr));
    }

    public static int meituan(int n,int [] arr){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp1=arr[j]*(int)Math.pow(10,String.valueOf(arr[i]).length())+arr[i];
                if(temp1%7==0){
                    count++;
                }
                int temp2=arr[i]*(int)Math.pow(10,String.valueOf(arr[j]).length())+arr[j];
                if(temp2%7==0){
                    count++;
                }
            }
        }
        return count;
    }
}
