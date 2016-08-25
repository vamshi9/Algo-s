improt java.util.*;
public class spiralTraverseOrderTree{
  public static void main(String[] args) {
     spiralTraverseOrderTree tree = new spiralTraverseOrderTree();
     tree.createSampleTree();

  }

  public void createSampleTree(){
      root = new TreeNode(0,new TreeNode(1,new TreeNode(4),new TreeNode(5,new TreeNode(7),new TreeNode(8))),new TreeNode(2,new TreeNode(3),new TreeNode(6,new TreeNode(7))));
      tree.printSpiralOrder(root);
  }

  public void printSpiralOrder(TreeNode root){
    if(root == null)
       return;
    Stack stEven = new Stack();
    Stack stOdd = new Stack();
    stEven.push(root);
    boolean evenValue = true;
    while(!stEven.isEmpty()&&evenValue==true || !stOdd.isEmpty()){
      if(evenValue){
        while(!stEven.isEmpty()){
          TreeNode node = stEven.pop();
          System.out.println(node.data);
          if(node.getRight()!= null){
            stOdd.push(node.getRight());
          }
          if(node.getLeft()!=null){
            stEven.push(node.getLeft());
          }
        }
        evenValue =!evenValue;
      }else{
        while(!stOdd.isEmpty()){
          TreeNode node = stOdd.pop();
          if(node.getLeft()!=null){
            stEven.push(node.getLeft());
          }
          if(node.getRight != null){
            stEven.push(node.getRight());
          }
        }
        evenValue = !evenValue;
      }
    }
  }

  class TreeNode{
    private int data;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int data,TreeNode left,TreeNode right){
      this.data = data;
      this.left = left;
      this.right = right;
    }

    public int getdata(){
       return data;
    }
    public TreeNode getRight(){
      return right;
    }
    public TreeNode getLeft(){
      return left;
    }
    public TreeNode(){
      super();
    }
    public TreeNode(int data){
      this.data = data;
    }
    @Override
    public String toString(){
      return data+"";
    }
  }
}
