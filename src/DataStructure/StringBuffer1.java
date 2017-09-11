package DataStructure;

/**
 * Created by zdmein on 2017/9/11.
 * StringBuffer的使用
 */
public class StringBuffer1 {
    public static void main(String [] args){
        String [] sysu={"sysu","in","gz"};
        String str=joinWords(sysu);
        System.out.println(str);
    }

    public static String joinWords(String [] sysu){
        StringBuffer sentence=new StringBuffer();
        for(String w:sysu){
            sentence.append(w);
        }
        return sentence.toString();
    }

}

/**
 * res:
 sysuingz
 */
