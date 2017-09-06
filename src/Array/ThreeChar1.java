package Array;

/**
 * Created by zdmein on 2017/9/6.
 * 找出字符数组中第一次只出现三次的字符
 思路：
 1、统计各字符出现次数
 2、遍历字符串，如果出现字符次数为3则输出该字符并跳出循环；否则如果不存在则输出" . "
 */
public class ThreeChar1 {

    public static void main(String [] args){
        String str="abesabjdwsjibuhfrsadfesdsferewh";
        char [] chars=str.toCharArray();
        ThreeChar(chars);
    }

    public  static void ThreeChar(char [] chars){
        if(chars==null||chars.length==0){
            System.out.println(".");
        }

        int [] res=new int[256];
        for(int i=0;i<chars.length;i++){
            res[chars[i]]++;
        }

        for(int i=0;i<chars.length;i++){
            if(res[chars[i]]==3){
                System.out.println(chars[i]);
                break;
            }
        }
    }
}
