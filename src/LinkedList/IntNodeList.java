package LinkedList;

/**
 * 回型链表
 */

public class IntNodeList {
    private IntNode head,tail;
    class IntNode {
        public int info;
        public IntNode next;
        public IntNode(int i){
            this(i,null);
        }
        public IntNode(int i,IntNode n){
            info=i;
            next=n;
        }
    }




    public IntNodeList(){
        head=tail=null;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public void addToHead(int el){
        head=new IntNode(el,head);
        if(tail==null)
            tail=head;
    }
    public void addToTail(int el){
        if(!isEmpty()){
            tail.next=new IntNode(el);
            tail=tail.next;
        }
        else head=tail=new IntNode(el);
    }

    public int deleteFromHead(){
        int el=head.info;
        if(head==tail)
            head=tail=null;
        else
            head=head.next;
        return el;
    }
    public int deleteFromTail(){
        int el=tail.info;
        if(head==tail)
            head=tail=null;
        else{
            IntNode tmp;
            for(tmp=head;tmp.next!=tail;tmp=tmp.next);
            tail=tmp;
            tail.next=null;

        }
        return el;
    }

    public void printAll(){
        System.out.print("[ ");
        for(IntNode tmp=head;tmp!=null;tmp=tmp.next){
            System.out.print(tmp.info+" ");
        }
        System.out.println("]");
    }

    public void clearAll(){
        //LinkedList.IntNodeList tmp;
        for(;head!=null;head=head.next){
            ;
        }
    }


    public boolean isInList(int el){
        IntNode tmp;
        for(tmp=head;(tmp!=null)&&(tmp.info!=el);tmp=tmp.next){
            ;
        }return tmp!=null;
    }
    public void delete(int el){
        if(!isEmpty()){
            if(head==tail&&el==head.info)
                head=tail=null;
            else if(el==head.info)
                head=head.next;
            else{
                IntNode pred,tmp;
                for(pred=head,tmp=head.next;
                    tmp!=null&&tmp.info!=el;
                    pred=pred.next,tmp=tmp.next
                        );
                if(tmp!=null){
                    pred.next=tmp.next;
                    if(tmp==tail)
                        tail=pred;
                }
            }
        }
    }

    class ListNode {
        public char data;
        public ListNode next;
        public ListNode(char c){
            this.data=c;
        }
    }

    public static boolean isPalindrome(ListNode head ){
        ListNode slow = head;
        ListNode fast= head;

        if(fast==null || fast.next==null){
            return true;
        }
        //一个每次走2步，一个每次走1步，所以当fast到表尾，slow肯定把链表折半
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode midNode=slow;
        ListNode firNode = slow.next; //后半段第一个节点
        ListNode cur=firNode.next; //从第一个节点开始插入
        firNode.next=null; //第一个节点最后变成最后一个节点，所以要置空
        while(cur!=null){
            ListNode nextNode = cur.next;
            cur.next=midNode.next;
            midNode=cur;
            cur=nextNode;
        }

        slow=head;
        fast=midNode.next;
        while (fast!=null){

            if(fast.data!=slow.data){
                return false;
            }
            slow=slow.next;
            fast=firNode.next;
        }
        return true;
    }
}