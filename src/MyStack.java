import java.util.Stack;

/**
 * Created by Administrator on 2017/8/9.
 */
public class MyStack {


    public enum Action {
        No , LToM , MToL , MToR , RToM
    }

    public static  int hannoProblem(int num , String left , String mid ,String right){
        Stack<Integer > ls =new Stack<Integer>();
        Stack <Integer> ms  =new Stack<Integer>();
        Stack <Integer> rs  =new Stack<Integer>();
        ls.push(Integer.MAX_VALUE);
        ms.push(Integer.MAX_VALUE);
        rs.push(Integer.MAX_VALUE);
        for( int i=num ;i>0;i--){
            ls.push(i);
        }
        Action [] record = {Action.No};
        int step = 0;
        while (rs.size()!=num+1){
            step+= fStackTotStack(record,Action.MToL,Action.LToM,ls,ms , left , mid);
            step+= fStackTotStack(record,Action.LToM,Action.MToL,ms,ls , mid , left);
            step+= fStackTotStack(record,Action.RToM,Action.MToR,ms,rs  , mid , right);
            step+= fStackTotStack(record,Action.MToR,Action.RToM,rs,ms , right, mid);

        }
        return step;
    }

    public static int fStackTotStack(Action [] record , Action preNoAct ,
                                     Action nowAct , Stack<Integer> fStack , Stack<Integer> tStack,
                                     String from , String to){
        if(record[0] != preNoAct && fStack.peek()<tStack.peek()){
            tStack.push(fStack.pop());
            System.out.println("Move"+"  "+tStack.peek()+"  "+"from" +"  "+ from +"  "+ "to" +"  "+ to);
            record[0]=nowAct;
            return 1;
        }
        return 0;
    }


    public static void main (String [] args){
        int num=2;
        String left="left";
        String mid ="mid";
        String right= "right";
        System.out.println(hannoProblem(num,left,mid,right));
    }


}
