package ProgrammingWritten;

import java.util.Scanner;

/**
 * Created by zdmein on 2017/9/12.
 * 魔法阵
 */
public class tenxun1 {
    public static void main(String [] args){
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int [][] point=new int[2*n] [4];
        int i=0;
        while (i<n*2){
            for(int j=0;j<4;j++){
                point[i][j]=cin.nextInt();
            }
            i++;
        }
        String [] res=new String[n];
        for(int k=0;k<n;k++){
            res[k]=isSquare(k,point);
        }
        for(int k=0;k<n;k++){
           System.out.println(res[k]);
        }
    }

    public  static class POINT{
        int x;
        int y;
        POINT(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static int dis(POINT a,  POINT b)
    {
        return (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
    }

    public  static boolean mid(POINT a, POINT b, POINT c, POINT d)
    {
        if(a.x + b.x == c.x + d.x && a.y + b.y == c.y + d.y) return true;
        return false;
    }

    public static String isSquare(int num, int [][] pin)
    {
        num=num*2;
        for(int i = 0; i < 4; i ++){
            for(int j = i + 1; j < 4; j ++)
                if(pin[num][i] == pin[num][j] && pin[num+1][i] == pin[num+1][j])
                    return "NO";
        }

        POINT [] p=new POINT[4];
        for(int i=0;i<4;i++){
             p[i]=new POINT(pin[num][i],pin[num+1][i]);
        }

        if(dis(p[0], p[1]) == dis(p[2], p[3]) && mid(p[0], p[1], p[2], p[3]) && dis(p[0], p[2]) == dis(p[0], p[3]))
            return "YES";
        if(dis(p[0], p[2]) == dis(p[1], p[3]) && mid(p[0], p[2], p[1], p[3]) && dis(p[0], p[1]) == dis(p[0], p[3]))
            return "YES";
        if(dis(p[0], p[3]) == dis(p[1], p[2]) && mid(p[0], p[3], p[1], p[2]) && dis(p[0], p[1]) == dis(p[0], p[2]))
            return "YES";
        return "NO";
    }
}
