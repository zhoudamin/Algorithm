package ProgrammingWritten;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/18.
 */
public class SearchTest {
        //为了生成随机查询的词列表
    private static final List<String> DIC = new ArrayList<>();
    private static final int MAX_LENGTH;
    static{


            int max=1;
            int count=0;
            String[] lines ={"中国","直播","游戏","游戏直播","综艺娱乐","互动直播平台","虎牙"};
            for(String line : lines){
                DIC.add(line);
                count++;
                if(line.length()>max){
                    max=line.length();
                }
            }
            MAX_LENGTH = max;

        }

//虎牙直播中国最大最好的互动直播平台。
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String text = cin.next();
        String s=listToString( seg(text),',');

        System.out.println(s);
    }

    public static String listToString(List list, char separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).toString().length()>1)
            sb.append(list.get(i)).append(separator);    }

    return sb.toString().substring(0,sb.toString().length()-1);}

    public static List<String> seg(String text){
        List<String> result = new ArrayList<>();
        while(text.length()>0){
            int len=MAX_LENGTH;
            if(text.length()<len){
                len=text.length();
            }
            //取指定的最大长度的文本去词典里面匹配
            String tryWord = text.substring(0, 0+len);
            while(!DIC.contains(tryWord)){
                //如果长度为一且在词典中未找到匹配，则按长度为一切分
                if(tryWord.length()==1){
                    break;
                }
                //如果匹配不到，则长度减一继续匹配
                tryWord=tryWord.substring(0, tryWord.length()-1);
            }
            result.add(tryWord);
            //从待分词文本中去除已经分词的文本
            text=text.substring(tryWord.length());
        }
        return result;
    }
}
