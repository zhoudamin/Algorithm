package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/21.
 */
public class xiechen1 {
    public static void main(String[] args){
        Scanner srt = new Scanner(System.in);
        int t3331 = srt.nextInt();
        int[] aaa = new int[t3331];
        for (int i = 0; i < aaa.length; i++) {
            aaa[i] = srt.nextInt();
        }
        int t2222 = srt.nextInt();
        int[] bbb = new int[t2222];
        for (int i = 0; i < bbb.length; i++) {
            bbb[i] = srt.nextInt();
        }
        System.out.println(xiec111(aaa,bbb));
    }
    public static double xiec111(int[] qw, int[] hj) {
        int m = qw.length;
        int n = hj.length;
        if (m > n) {
            int[] temp = qw; qw = hj; hj = temp;
            int tmp = m; m = n; n = tmp;
        }
        int minqw = 0, frmax = m, lenharf = (m + n + 1) / 2;
        while (minqw <= frmax) {
            int i = (minqw + frmax) / 2;
            int j = lenharf - i;
            if (i < frmax && hj[j-1] > qw[i]){
                minqw = minqw + 1;
            }
            else if (i > minqw && qw[i-1] > hj[j]) {
                frmax = frmax - 1;
            }
            else {
                int maxLsdeft = 0;
                if (i == 0) { maxLsdeft = hj[j-1]; }
                else if (j == 0) { maxLsdeft = qw[i-1]; }
                else { maxLsdeft = Math.max(qw[i-1], hj[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLsdeft; }

                int minRight = 0;
                if (i == m) { minRight = hj[j]; }
                else if (j == n) { minRight = qw[i]; }
                else { minRight = Math.min(hj[j], qw[i]); }

                return (maxLsdeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

}
