package String;

public class List {
    public static void main(String[] args){
        String str1="how are you";
        System.out.println(wordCount(str1));
    }

    public  static int wordCount(String str){
       int count =0;
       int i=1;
       for(;i<str.length();i++){
           if(str.charAt(i-1)!=' '&&str.charAt(i)==' '){
               count++;
           }
       }
       if( str.charAt(i-1)!=' '){
           count++;
       }
       return count;
    }
}
