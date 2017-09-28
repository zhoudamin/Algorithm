package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/28.
 */
public class webank1 {
    public static void main(String[] args){
        Scanner srt = new Scanner(System.in);
        long t3331 = srt.nextLong();
        long t3332 = srt.nextLong();
        long t3333 = srt.nextLong();

        System.out.println(we1(t3331,t3332,t3333));
    }

    public static int we1(long t1,long t2,long t3){

       String res1=expString(2,t1);
        String res2=expString(2,t2);
        String res3=expString(2,t3);

        int xx1 = Integer.parseInt(res1);
        int xx2 = Integer.parseInt(res2);
        int xx3 = Integer.parseInt(res3);
         int res=xx1+xx2-xx3;
        String result = "";
        boolean minus = false;

        //如果该数字为负数，那么进行该负数+1之后的绝对值的二进制码的对应位取反，然后将它保存在result结果中
        if(res < 0){
            minus = true;
            res = Math.abs(res + 1);
        }

        while(true){
            int remainder = (!minus && res % 2 == 0) || (minus && res % 2 == 1) ? 0 : 1;
            //将余数保存在结果中
            result = remainder + result;
            res /= 2;
            if(res == 0){
                break;
            }
        }

        //判断是否为负数，如果是负数，那么前面所有位补1
        if(minus){
            res = result.length();
            for(int i = 1; i <= 32 - res; i++){
                result = 1 + result;
            }
        }
        int count=0;
        for(int j=0;j<result.length();j++){
            if(result.charAt(j)=='1'){
                count++;
            }
        }

        return count;

    }


    private static String expString(Integer bottom, long var) {
        int i = 0;
        String str = "1";
        while (i < var) {
            str = multiString(str, bottom);
            i++;
        }
        return str;
    }

    private static String multiString(String str, Integer var) {
        char[] c = str.toCharArray();
        //结果可能和原数组一样长或者比原数组长度长1， 2的3次幂是8,2的4次幂就是16了
        char[] result = new char[c.length + 1];
        //temp用来表示是否有进位
        int temp = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            //48 是 0对应的ASCII码
            int j = (int) c[i] - 48;
            int all = j * var;
            result[i + 1] = ((char) ((all % 10 + temp) % 10 + 48));
            temp = (all + temp) / 10;
        }
        if (temp != 0) {
            //如果有进位
            result[0] = (char) (temp + 48);
        }

        //去掉不需要的0
        return String.valueOf(result).replaceAll("\u0000", "");
    }
}
