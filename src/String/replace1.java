package String;

/**
 * Created by zdmein on 2017/9/1.
 * 字符串的调整与替换
 *把 "a b  c" 替换后为  “a%20b%20%20c”
 */
public class replace1 {
    public static void main(String [] args ){
        String str="a b  c";
        char chas[]=new char[20];
        for(int i=0;i<str.length();i++){
            chas[i]=str.charAt(i);
        }
        replace(chas);

    }

    public static void replace(char [] chas){
        int len=0;
        int num=0;
        for(;len<chas.length && chas[len]!=0;len++){
            if(chas[len]==' '){
                num++;
            }
        }
        int index=len+num*2;
        for(;index>=0;index--){
            if (chas[len--]==' '){
                chas[index--]='0';
                chas[index--]='2';
                chas[index]='%';
            }else {
                chas[index]=chas[len+1];
            }
        }
        System.out.println(chas);
    }
}
