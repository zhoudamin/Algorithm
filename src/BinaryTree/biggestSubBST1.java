package BinaryTree;

/**
 * Created by zdmein on 2017/9/8.
 * 找到二叉树中的最大搜索二叉子树
 题目：给定一棵二叉树的头节点head, 已知其中所有节点的值都不一样，
 找到含有节点最多的搜索二叉子树，并返回这颗子树的头节点。
                              6
                          /    \
                        1       12
                    /\        /    \
                 0   3     10       13
                          /  \      /  \
                         4    14    2   9
                        /\     /\
                       2  5    1  6
 二叉搜索树：
        10
       /  \
     4     14
    / \    / \
   2  5   1   6

 要求：
 如果节点数为N，要求时间复杂度为O（N） ,额外空间复杂度为O(h),h为二叉树的高度。
 解：
 以节点node为头的树中，最大的搜索二叉子树只可能来自一下两种情况。
 1.如果来自node左子树上的最大搜索二叉子树是以node.left为头的；来自node右子树的最大搜索二叉树是以node.right为头的；node左子树上的最大搜索二叉子树的最大值小于node。value；node右子树的最大搜索二叉子树的最小值大于node.value,那么以节点node为头的整棵树都是搜索二叉树。
 2如果不满足第一中情况，说明节点node为头的整颗树不能连成搜索二叉树。这种情况下，以node为头的树上的最大搜索二叉子树来自node的左子树上的最大搜索二叉子树和来自右子树上的最大搜索二叉子树之间，节点较多的那个。
 过程如下：
 1，整个过程是二叉树的后序遍历。（左右根）
 2，遍历到当前节点记为cur时，先遍历cur的左子树收集4个信息，分别是左子树上最大搜索二叉子树的头节点（IBST） ，节点数（ISize）,最小值（IMin）,最大值（IMax）.
 再遍历cur的右子树收集4个信息，分别是右子树上最大搜索二叉子树的头节点（RBST） ，节点数（RSize）,最小值（RMin）,最大值（RMax）.
 3, 根据步骤2收集的信息，判断是否满足第一种情况，如果满足第一种情况就返回cur，如果满足第二种情况，就返回IBST和RBST中较大的一个。
 4，可以使用全局变量的方式实现步骤2中收集节点数，最大和最小的情况。

 */
public class biggestSubBST1 {
    public class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int data){
            this.value=data;
        }
    }

    public Node biggestSubBST(Node head){
        int [] record =new int[3];
        return posOrder(head , record);
    }

    public Node posOrder(Node head,int [] record){
        if(head==null){
            record[0]=0;
            record[1]=Integer.MAX_VALUE;
            record[2]=Integer.MIN_VALUE;
            return null;
        }

        int value=head.value;
        Node left=head.left;
        Node right=head.right;
        Node lBST=posOrder(left,record);
        int lSize=record[0];
        int lMin=record[1];
        int lMax=record[2];
        Node rBST=posOrder(right,record);
        int rSize=record[0];
        int rMin=record[1];
        int rMax=record[2];
        record[1]=Math.min(value,lMin);
        record[2]=Math.max(value,rMax);
        if(left==lBST&&right==rBST&&lMax<value&&rMin>value){
            record[0]=lSize+rSize+1;
            return head;
        }

        record[0]=Math.max(lSize,rSize);
        return lSize>rSize?head.left:head.right;
    }
}
