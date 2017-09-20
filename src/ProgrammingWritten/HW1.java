package ProgrammingWritten;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/20.
 */
public class HW1 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String [] strs = str.split(" ");
            int[] arr = new int[strs.length];
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<strs.length;i++){
                arr[i] = Integer.parseInt(strs[i]);
            }
            Arrays.sort(arr); //进行排序
            int temp =0;
            int count =0;
            int i=0;
            while(temp<strs.length){
                sb.append(arr[temp]);
                i=temp+1;
                while(i<arr.length && arr[temp]==arr[i]){
                    count++;
                    i++;
                }
                sb.append(" "+(count+1)+" ");
                count=0;
                temp=i;
            }
            System.out.println(sb.toString().trim());
        }
    }

