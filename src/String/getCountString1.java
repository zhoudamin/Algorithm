package String;

/**
 * Created by zdmein on 2017/9/5.
 * 字符串的统计字符串
 统计字符串中每个字符的出现频率，返回一个字符串统计，key 为统计字符，value 为出现频率
输入：
 aaabbadddffc
 输出：
 a_3_b_2_a_1_d_3_f_2_c_1

 */
public class getCountString1 {
    public static void main(String [] args){
        String str="aaabbadddffc";
        System.out.println(getCountString(str));

    }

    private static String getCountString(String str){
        if(str==null||str.length()==0){
            return "";
        }

        char [] chs=str.toCharArray();
        String res=String.valueOf(chs[0]);
        int num=1;
        for(int i=1;i<str.length();i++){
            if(chs[i]==chs[i-1]){
                num++;
            }else {
                res=res+"_"+String.valueOf(num)+"_"+String.valueOf(chs[i]) ;
                num=1;
            }
        }
        return res+"_"+String.valueOf(num)+"" ;
    }
}
