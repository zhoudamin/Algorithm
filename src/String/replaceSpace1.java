package String;

/**
 * Created by zdmein on 2017/11/6.
 *
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 */
public class replaceSpace1 {
    public static String replaceSpace(StringBuffer str) {
        String s=str.toString();
        String[] split = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if(split[i].equals(" "))
                stringBuilder.append("%20");
            else
                stringBuilder.append(split[i]);
        }
        //stringBuilder.append(split[split.length-1]);
        String strNew = stringBuilder.toString();
        return strNew;

    }

    public static void main(String [] args){
        StringBuffer str=new StringBuffer("hello Wor");
        System.out.println(replaceSpace(str));

    }
}
