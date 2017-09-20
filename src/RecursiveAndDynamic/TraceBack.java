package RecursiveAndDynamic;

/**
 * Created by zdmein on 2017/9/20.
 */
public class TraceBack {
    public static void main(String []argc)
    {
        String str="abbc";
        char[] ch=str.toCharArray();

        TraceBack test=new TraceBack();
        test.permutation(ch, 0);
    }

    public void permutation(char[] ch,int index)
    {
        if(index==ch.length-1)
        {
            System.out.println(new String(ch));
        }
        for(int i=index;i<ch.length;i++)
        {
            if(is_swap(ch,index,i)==true)
            {
                swap(ch,index,i);
                permutation(ch,index+1);
                swap(ch,index,i);
            }
        }
    }
    public void swap(char[]ch,int index,int i)
    {
        char temp=ch[index];
        ch[index]=ch[i];
        ch[i]=temp;
    }
    //当该字符在以前没有出现过，则交换；
    public boolean is_swap(char[] ch,int index,int i)
    {
        for(int k=index;k<i;k++)
        {
            if(ch[k]==ch[i])
            {
                return false;
            }
        }
        return true;
    }


}
