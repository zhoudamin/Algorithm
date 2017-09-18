package String;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/18.
 * 判断是不是整体有效的括号字符串
 * 括号字符串的有效性和最长有效长度
 */
public class isValid1 {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        String str=cin.next();
        System.out.println(isValid(str));
    }

    public static boolean isValid(String str){
        if(str==null ||str.equals("")){
            return false;
        }

        char [] chs=str.toCharArray();
        int status=0;
        for(int i=0;i<str.length();i++){
            if(chs[i]!=')'&&chs[i]!='('){
                return false;
            }
            if(chs[i]==')'&&--status<0){
                return false;
            }
            if(chs[i]=='('){
                status++;
            }
        }
        return status==0;

    }
}
