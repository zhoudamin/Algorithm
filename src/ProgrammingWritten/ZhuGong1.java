package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/11.
 * 签到问题
 */
public class ZhuGong1 {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        String str=cin.next();
        System.out.println(gift(str));
    }

    public static String gift(String str){
        if(str==null||str.length()==0){
            return "NO";
        }

        char [] chs=str.toCharArray();
        int countA=0;
        int countL=0;
        boolean flag=false;
        for(int i=0;i<chs.length;i++){
            if(chs[i]=='A'){
                countA++;
            }
            if(chs[i]=='L'){
                countL++;
                if(countL>=3){
                    flag=true;
                }
            }else {
                countL=0;
            }
        }
        if(flag||countA>1){
            return "NO";
        }
        return "YES";

    }
}
