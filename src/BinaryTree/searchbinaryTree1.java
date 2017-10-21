// 前序遍历  递归
public void preOrder(Node node){
      list.add(node);
      if(node.lchid!=null){
          preOrder(node.lchid);
      }
      if(node.rchid!=null){
          preOrder(node.rchid);
      }
}


// 前序遍历 非递归
public void IteratorPreorder(Node node){
  Stack<Node> stack = new Stack<Node>();
  if(node != null){
    stack.push(node);
    while(!stack.empty()){
        node=stack.pop();
        visit(node);
        if(node.getRight()!=null)
            stack.push(node.getRight());
            
            // 栈后进先出 所以先右后左进栈
        if(node.getLeft()!=null)
            stack.push(node.getLeft());
    }
  }
}
