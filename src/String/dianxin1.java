package String;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/24.
 */
public class dianxin1 {
 public static void main(String[] args){
    Scanner cin =new Scanner(System.in);
    while(cin.hasNext())
    {
        String strsb=cin.nextLine();
        char[] chararr=strsb.toCharArray();
        StringBuffer stt =new StringBuffer();
        for (int ik=0;ik<26;ik++)
      {
            char c = (char)(ik+'A');
          for (int j=0;j<chararr.length;j++)
     {
     if (chararr[j]==c||chararr[j]==(char)(c+32))
         stt.append(chararr[j]);
        }

    }
     for (int j=0;j<chararr.length;j++)
     {
    if (!(chararr[j]>='A'&&chararr[j]<='Z'||chararr[j]>='a'&&chararr[j]<='z'))
        stt.insert(j,chararr[j]);
     }
     System.out.println(stt.toString());
        }
 }
}
