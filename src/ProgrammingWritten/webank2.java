package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/28.
 */
public class webank2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        Integer it = Integer.valueOf(string);

        System.out.println(we2(it));
    }

    public static int we2(Integer t1){
        String er =Integer.toBinaryString(t1);
        String ba=Integer.toOctalString(t1);
        String shier=shier(t1);
       String shiliu=Integer.toHexString(t1);
        String [] result={er,ba,shier,shiliu};
        int max=0;

        int index=0;
        while (index<result.length) {
            int res=0;
            for (int i = 0; i < result[index].length(); i++) {
                if(result[index].charAt(i)>='0'&&result[index].charAt(i)<='9') {
                    res += result[index].charAt(i) - '0';
                }else {
                    res += result[index].charAt(i) - 'A'+10;
                }
            }
            max=Math.max(max,res);
            index++;
        }

        return max;

    }


    public static String shier(Integer i){
        StringBuilder stringBuilder=new StringBuilder("");
        Integer zheng=i/12;
        Integer yu=i%12;
        stringBuilder =aBString(yu);
        while(zheng>0){
            yu=zheng%12;
            zheng=zheng/12;
            stringBuilder=aBString(yu).append(stringBuilder);
        }
        return stringBuilder.toString();
    }

    public static StringBuilder aBString(Integer i){
        StringBuilder stringBuilder=new StringBuilder();
        switch ((int)i) {
            case 10:
                return stringBuilder.append("A");
            case 11:
                return stringBuilder.append("B");
        }
        return stringBuilder.append(i);
    }
}
