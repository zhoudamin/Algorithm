package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/14.
 */
public class HKvision2 {
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        String st1=cin.nextLine();


       // int    n = cin.nextInt();

        System.out.println(treeCompany(st1));

    }

    public static String treeCompany(String str){
        char [] chs=str.toCharArray();
        char indexnum= '0';
        char indexA='A';
        for(int i=0;i<chs.length;i+=6){
            if(chs[i]!=indexnum  && chs[i+2]!=indexA ){
                return "incorrect data";
            }
            indexA++;
            indexnum++;
        }
//1,A,0;2,B,1;3,C,1
        StringBuffer [] buffers=new StringBuffer[str.length()/5];

        for(int i=0;i<str.length()/5;i++){
                buffers[i] = new StringBuffer();
        }
      //  StringBuffer buffers1=new StringBuffer();
       // buffers1.append(chs[2]);
        buffers[0].append(chs[2]);
        for(int i=10;i<str.length();i+=6){

            buffers[Integer.parseInt(String.valueOf(chs[i]))-1].append("-");
            buffers[Integer.parseInt(String.valueOf(chs[i]))-1].append(chs[i-2]);

        }
        String res=buffers[0].toString();
       for(int i=1;i<2;i++){
           res+=";";
            res+=buffers[i].toString();
       }
 return res;
    }

}
