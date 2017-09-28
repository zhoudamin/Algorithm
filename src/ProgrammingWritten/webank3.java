package ProgrammingWritten;
import java.util.Scanner;
import java.util.Stack;
/**
 * Created by zdmein on 2017/9/28.
 */
public class webank3 {
        private static char[] arr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        public static int flag = 1;
        public static String n10toN(long number, int N) {
            Long rest = number;
            Stack<Character> stk = new Stack<Character>();
            StringBuilder result = new StringBuilder(0);
            while (rest != 0) {
                stk.add(arr[new Long((rest % N)).intValue()]);
                rest = rest / N;
            }
            for (; !stk.isEmpty();) {
                result.append(stk.pop());
            }
            return result.length() == 0 ? "0" : result.toString();

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            for (int k = 1; k <= num; k++) {
                String str1 = n10toN(k, 2);

                StringBuilder strb = new StringBuilder(str1);
                strb.reverse();
                int count = 0;

                for (int i = 0; i < str1.length(); i++) {
                    if (str1.charAt(i) != strb.charAt(i)) {
                        break;
                    } else {
                        count++;
                    }
                }
                if (count == str1.length()) {
                    flag ++;

                }
            }
            System.out.println(flag);

        }
}
