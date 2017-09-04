package String;

/**
 * Created by zdmein on 2017/9/4.
 * 替换字符串中连续出现的指定字符串
 题目：
 给定单个字符串str、from和to，已知from字符串中无重复字符，把str中所有from的子串全部替换成to字符串，对连续出现from的部分要求只替换成一个to字符串，返回最终结果字符串。
 举例：
 str="123abc"，from="abc"，to="4567"，返回"1234567"；
 str="123"，from="abc"，to="4567"，返回"123"；
 str="123abcabc"，from="abc"，to="X"，返回"123X"；
 */
public class replace3 {
    public static void main(String args[]){
        String str="123abcabc";
        String from="abc";
        String to = "4567";
        System.out.println(replace(str,from,to));

    }

    private static String replace(String str,String from ,String to){
        if(str==null||from==""||to==""){
            return str;
        }

        char[] chstr=str.toCharArray();
        char[] chfrom=from.toCharArray();
        int match=0;
        for(int i=0;i<str.length();i++){
            if(chstr[i]==chfrom[match++]){
                if(match==chfrom.length){
                    clear(chstr,i,chfrom.length);
                    match=0;
                }
            }else {
                match=0;
            }
        }

        String res="";
        for(int i=0;i<chstr.length;i++){
            if(chstr[i]!=0){
                while (chstr[i]!=0){
                    res+=chstr[i++];
                }
            }

            if(chstr[i]==0){
                while (i!=chstr.length&&chstr[i]==0){
                    i++;
                }
                res+=to;
                i--;
            }

        }

        return res;
    }

    private static void clear(char[] chstr , int end ,int len){
        while(len--!=0){
            chstr[end--]=0;
        }
    }
}
