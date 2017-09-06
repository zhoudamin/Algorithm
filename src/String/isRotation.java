package String;

/**
 * Created by zdmein on 2017/9/6.
 * 判断两个字符串是否互为旋转词
 题目：
 如果一个字符串str，把字符串str前面任意的部分挪到后面形成的字符串叫做str的旋转词。
 如str="12345"，str的旋转词有"12345"、"23451"、"34512"、"45123"、"51234"。
 给定两个字符串a和b，请判断a和b是否互为旋转词。
 举例：
 a="cdab"，b="abcd"，返回true；
 a="1ab2"，b="ab12"，返回false；
 a="2ab1"，b="ab12"，返回true。
 要求：
 如果a和b长度不一样，那么a和b必然不互为旋转词，可以直接返回false。
 当a和b长度一样，都为N时，要求解法的时间复杂度为O(N)。
 */
public class isRotation {

    public boolean isRotation(String a ,String b){
        if(a==null||b==null||a.length()!=b.length()){
            return false;
        }
        String b2=b+b;
        return KMP(b2,a)!=-1;   //  KMP算法
    }

    public static int  KMP(String source , String pattern){
    //    int [] N=getN(pattern);
        return -1;
    }


}
