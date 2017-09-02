package String;

/**
 * Created by zdmein on 2017/9/2.
 * 翻转字符串
 * 写一个函数，将字符串翻转，翻转方式如下：“I am a student”反转成“student a am I”，不借助任何库函数。
 */
public class rotateWord1 {
    public static void main(String [] args){
        String str= "dogs love pig.";

        rotateWord(str);
    }

    public static void  rotateWord(String str){
        if(str==null||str.length()==0){
            return ;
        }

        char [] strArr = str.toCharArray();
        reverse(strArr,0,strArr.length-1);
        int index=0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i]==' '){
                reverse(strArr,index,i-1);
                index=i+1;
            }
        }
        reverse(strArr,index,strArr.length-1);
        System.out.println(strArr);


    }

    public static void reverse(char[] strArr ,int first ,int end){
        while (first<end){
            char tmp=strArr[first];
            strArr[first]=strArr[end];
            strArr[end]=tmp;
            first++;
            end--;
        }
    }

}
