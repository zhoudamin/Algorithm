package ProgrammingWritten;

/**
 * Created by zdmein on 2017/9/11.
 * 点是否在三角形内
 * 输入：三角形三顶点坐标：A、B、C，以及待确认的点：P
 * 输出：无
 * 返回：在三角形内返回true，否则返回false

 叉乘法
 沿着三角形的边按顺时针方向走，判断该点是否在每条边的右边（这可以通过叉乘判断），
 如果该点在每条边的右边，则在三角形内，否则在三角形外。这个算法只用到了三次叉乘，
 没有除法运算和三角函数、开根号等运算，所以效率很高，而且精度很高（没有浮点误差）。

 设三角形三点A(x1,y1)B(x2,y2)C(x3,y3)，已知点M(x,y),

 1,先求出三个向量MA,MB,MC.

 2,计算MA X MB,MB X MC,MC X MA (X表叉乘)
 PS: (MA X MB) = x1 * y2 - x2 * y1.

 3,如果此三组的向量叉乘的结果都是同号的（或都正，或都负），即方向相同的，
 则说明点M在三角形每条边的同侧，即内部。否则必在外部！
 */
public class ZhuGong2 {
    public static class POINT {
        int x;
        int y;

        public POINT(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

        public static void main(String [] args){
              POINT A=new POINT(1,1);
              POINT B=new POINT(1,5);
              POINT C=new POINT(5,1);
            POINT P=new POINT(2,2);
            System.out.println(isInTriangle(A,B,C,P));

        }

    public static  boolean isInTriangle(POINT A, POINT B, POINT C, POINT P)
    {
         /*利用叉乘法进行判断,假设P点就是M点*/
        int a = 0, b = 0, c = 0;

        /*向量减法*/
        POINT MA = new POINT(P.x - A.x,P.y - A.y);
        POINT MB = new POINT(P.x - B.x,P.y - B.y);
        POINT MC = new POINT(P.x - C.x,P.y - C.y);

        /*向量叉乘*/
        a = MA.x * MB.y - MA.y * MB.x;
        b = MB.x * MC.y - MB.y * MC.x;
        c = MC.x * MA.y - MC.y * MA.x;

        if((a <= 0 && b <= 0 && c <= 0)||
                (a > 0 && b > 0 && c > 0))
        {
            return true;
        }

        return false;
    }

}
