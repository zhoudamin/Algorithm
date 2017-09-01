package String;

/**
 * Created by zdmein on 2017/9/1.
 * 只含有数字字符和“”字符的字符类型数组，把数字字符挪到右边， *挪到左边
 12**35
 **1235
 */
public class replace2 {
    public static void main(String [] args ){
        String str="12**35";
        char chas[]=new char[20];
        for(int i=0;i<str.length();i++){
            chas[i]=str.charAt(i);
        }
        modify(chas);

    }

    public static void modify(char [] chas){
        if(chas==null||chas.length==0){
            return;
        }

        int j=chas.length-1;
        for(int i=chas.length-1;i>=0;i--){
            if(chas[i]!='*'){
                chas[j--]=chas[i];
            }
        }

        for(;j>=0;j--){
            chas[j]='*';
        }

        System.out.println(chas);
    }
}
