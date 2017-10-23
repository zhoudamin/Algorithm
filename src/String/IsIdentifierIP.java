package String;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/10/23.
 * 写一个算法判断某个字符串是不是一个合法的IP地址。
 */
public class IsIdentifierIP {
    public static void main(String [] args){
        Scanner scanner =new Scanner(System.in);
        String input=null;
        System.out.println("请输入待判定字符串：");
        input=scanner.nextLine();
        if(isIdentifierIP(input)){
            System.out.println("is IP");
        }else {
            System.out.println("Not is IP");
        }
    }

    public static boolean isIdentifierIP(String input){
        if(input!=null && input.length()>0){
            String [] ipn=input.split("\\.");
            if(ipn.length!=4) return false;
            try {
                if(Integer.parseInt(ipn[0])>0  && Integer.parseInt(ipn[0])<=255
                        &&  Integer.parseInt(ipn[1])>=0 && Integer.parseInt(ipn[1])<=255
                        &&  Integer.parseInt(ipn[2])>=0 && Integer.parseInt(ipn[2])<=255
                        &&  Integer.parseInt(ipn[3])>=0 && Integer.parseInt(ipn[3])<=255){
                    return true;
                }
            }catch (NumberFormatException e){
                return false;
            }
        }
        return false;
    }
}
