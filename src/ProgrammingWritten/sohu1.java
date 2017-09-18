package ProgrammingWritten;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by zdmein on 2017/9/17.
 */
public class sohu1 {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        String  unixin=cin.nextLine();
        System.out.println(sohuPath(unixin));

    }
        public static String sohuPath(String unixin) {
            Stack<String>  stk=new Stack<String>();
            while(unixin.length()>0){
                int first=unixin.indexOf("/");
                unixin=unixin.substring(first+1);
                int last=unixin.indexOf("/");
                if(last==-1)
                    last=unixin.length();
                String temp=unixin.substring(0,last);
                unixin=unixin.substring(last);
                if(temp.equals(".") || temp.equals(""))
                    continue;
                if(temp.equals("..")){
                    if(stk.isEmpty()==false)
                        stk.pop();
                }
                else stk.push("/"+temp);
            }
            String result="";
            while(stk.isEmpty()==false){
                result=stk.pop()+result;
            }
            if(result.length()==0)
                result="/";
            return result;
        }
}
