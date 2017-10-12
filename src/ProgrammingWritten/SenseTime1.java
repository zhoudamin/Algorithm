package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/10/12.
 */
public class SenseTime1 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int n = cin.nextInt();
        int num=sen1(n);
        System.out.println(num);


        }

        public static int sen1(int n){
          int big=26;
          if(n<1) return 0;
          if(n<10){
              return 1;
          }else if(n<big){
              return 2;
          }
      return 0;
     }
}
