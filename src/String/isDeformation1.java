package String;

/**
 * Created by zdmein on 2017/9/1.
 * 判断两个字符串是否互为变形词
 * 给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，那么str1和str2互为变形词。请实现函数判断两个字符串是否互为变形词。
 　　str1="123",str2="231",返回true。
 　　str1="123",str2="2331",返回false。
 */
public class isDeformation1 {
    public static void main(String args []){
        String str1="54s6";
        String str2="465d";
        System.out.println(isDeformation(str1,str2));
    }

    public static boolean isDeformation(String str1 ,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int res[]=new int [256];
        int index=0;
        while (index!=str1.length()){
            res[str1.charAt(index)]++;
            res[str2.charAt(index++)]--;
        }

        for(int i=0;i<256;i++){
            if(res[i]!=0){
                return false;
            }
        }
        return true;
    }

}
