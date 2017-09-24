package String;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/24.
 */
public class dianxin2 {
        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            String str = cin.nextLine();
            ArrayList<String> allnum = new ArrayList<>();
            int flag=0;
            while(flag<str.length()){
                StringBuilder strsb = new StringBuilder();
                while (flag<str.length() && Character.isDigit(str.charAt(flag))){
                    strsb.append(str.charAt(flag));
                    flag++;
                }
                if(strsb.length()>=1){
                    allnum.add(strsb.toString());
                }
                flag++;
            }
            for(int i=0;i<allnum.size();i++){
                System.out.print(allnum.get(i));
                if(i!=allnum.size()-1)
                    System.out.print(" ");
            }

        }
    }


