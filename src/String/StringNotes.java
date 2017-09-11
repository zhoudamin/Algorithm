package String;

/**
 * Created by zdmein on 2017/9/11.
 */
public class StringNotes {
    public static void main(String [] args){
        System.out.println("== 与 equals 区别：");
        String str1="adbc";
        String str2=new String("adbc");
        //== 用来确定两个字符串是否放置在同一个位置上。
        System.out.println(str1==str2);
        //equals 用于判断两个变量是否是对同一个对象的引用，即堆中的内容是否相同，返回值为布尔类型。
        System.out.println(str1.equals(str2));

        System.out.println();
        System.out.println("字符串是否以指定的字符串开头。结尾同理。");
        String s1="adasjdh";
        System.out.println(s1.startsWith("ad"));
        System.out.println(s1.endsWith("dh"));

        System.out.println();
        System.out.println("字符串中是否包含另一个字符串。");
        String s2="123456";
        System.out.println(s2.contains("234"));

        System.out.println();
        System.out.println("字符串中另一个字符串出现的位置。");
        String s3="aferebg";
        System.out.println(s3.indexOf("er"));

        System.out.println();
        System.out.println("字符串中指定的字符串替代另一个字符串。");
        String s4="sdafrerfreg";
        s4=s4.replace("f","m");
        System.out.println(s4);

        System.out.println();
        System.out.println("将字符串转变为字符数组。或字节数组。");
        String s6="12345648";
        byte[] b=s6.getBytes();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        System.out.println();
        System.out.println(" 将字母字符串转为大写的字母字符串。");
        String s7="asdfg";
        System.out.println(s7.toUpperCase());

        System.out.println();
        System.out.println("将字符串按照指定的方式分解成多个字符串，“zdm,lss,hae”获取三个姓名");
        String s8="zdm,lss,hae";
        String [] names=s8.split(",");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
