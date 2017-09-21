package ProgrammingWritten;
import java.util.*;
/**
 * Created by zdmein on 2017/9/21.
 */
public class xiechen2 {

        public static void main(String[] args)
        {
            Scanner scr = new Scanner(System.in);
            String st111 = scr.nextLine();
            String ss = xiec2(st111);
            System.out.println(ss);
        }

        // 删除字符串中相同的字符  
        public static String xiec2(String st111)
        {
            Set<String> sethah = new LinkedHashSet<String>();
            String[] strdseArray = st111.split("");
            StringBuffer sbtr = new StringBuffer();
            for (int i =0;i<strdseArray.length;i++)
            {
                if(!sethah.contains(strdseArray[i]))
                {
                    sethah.add(strdseArray[i]);
                    sbtr.append(strdseArray[i]);
                }
            }
            return sbtr.toString().substring(0,sbtr.toString().length());
        }
    }

