package DataStructure;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zdmein on 2017/9/11.
 * ArrayList 的使用方法
 */
public class ArrayList1 {
    public static void main(String [] args){
        String [] words={"hello","xiaomi","zdm"};
        String [] more={"sysu","zhihu"};

        ArrayList<String> list=merge(words,more);

        System.out.println("输出方法1:");
        Iterator it1=list.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println();
        System.out.println("输出方法2:");
        for(String tmp:list){
            System.out.println(tmp);
        }

        list.remove(3);
        list.remove("hello");

        System.out.println();
        System.out.println("输出方法3:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
}

    public static ArrayList<String> merge (String[] words,String [] more){
        ArrayList<String> sentence = new ArrayList<String>();
        for(String w:words) sentence.add(w);
        for(String m:more) sentence.add(m);

        return sentence;
    }
}

/**
 * 输出结果：

 输出方法1:
 hello
 xiaomi
 zdm
 sysu
 zhihu

 输出方法2:
 hello
 xiaomi
 zdm
 sysu
 zhihu

 输出方法3:
 xiaomi
 zdm
 zhihu

 */

