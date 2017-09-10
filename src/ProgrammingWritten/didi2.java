package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/10.
 */
public class didi2 {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);

         int    n = cin.nextInt();

            System.out.println(getugly(n));

    }
        public  static int getugly(int n) {
            if(n==0)
                return 0;
            int[] a = new int[n];
            int count = 1;
            a[0] = 1;
            int num2 = 0;
            int num3 = 0;
            int num5 = 0;
            while(count<n){
                int min = min(a[num2]*2,a[num3]*3,a[num5]*5);
                a[count] = min;
                while(a[num2]*2<=a[count]) num2++;
                while(a[num3]*3<=a[count]) num3++;
                while(a[num5]*5<=a[count]) num5++;
                count++;
            }
            int result = a[n-1];
            return result;
        }

        public static int min(int a,int b,int c){
            int tmp = a>b?b:a;
            return tmp>c?c:tmp;
        }
}
