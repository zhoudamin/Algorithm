package IO;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/8.
 */
public class nextInt1 {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            int aa = cin.nextInt();
            b = cin.nextInt();
            System.out.println(a + b);
        }
    }
}
