package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zdmein on 2017/9/7.
 * 二叉树的序列化和反序列化
               12
           /      \
         3        null
     /    \
  null    null
 先序遍历：12！3！#！#！#！
 */
public class NodeSerial {
    /**
     * 定义Node
     */
    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int data){
            this.value=data;
        }
    }

    /**
     * 先序遍历
     */
    public String serialByPre(Node head){
        if(head==null){
            return "#!";
        }

        String res=head.value+"!";
        res+=serialByPre(head.left);
        res+=serialByPre(head.right);
        return res;
    }

    /**
     * 先序遍历反序列化
     */
    public Node reconByPreString(String preStr){
        String [] values=preStr.split("!");
        Queue<String> queue=new LinkedList<String>();
        for(int i=0;i<values.length;i++){
            queue.offer(values[i]);
        }
        return reconPreOrder(queue);
    }

    /**
     * Queue
     add        增加一个元索                     如果队列已满，则抛出一个IIIegaISlabEepeplian异常
     remove     移除并返回队列头部的元素         如果队列为空，则抛出一个NoSuchElementException异常
     element    返回队列头部的元素               如果队列为空，则抛出一个NoSuchElementException异常
     offer      添加一个元素并返回true           如果队列已满，则返回false
     poll       移除并返问队列头部的元素         如果队列为空，则返回null
     peek       返回队列头部的元素               如果队列为空，则返回null
     put        添加一个元素                     如果队列满，则阻塞
     take       移除并返回队列头部的元素         如果队列为空，则阻塞
     */

    public Node reconPreOrder(Queue<String> queue){
        String value = queue.poll();
        if(value.equals("#")){
            return null;
        }

        Node head=new Node(Integer.valueOf(value));
        Node left=reconPreOrder(queue);
        Node right=reconPreOrder(queue);
        return head;
    }

}
