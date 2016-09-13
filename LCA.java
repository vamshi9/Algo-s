import java.util.*;
public class LCA{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int i=t;i>0;i--){
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      LCA obj = new LCA();
      obj.createSampleTree();
      int num = obj.findLCA(root,n1,n2);
      System.out.println(num);
    }
  }

  public static int findLCA(TreeNode currentNode,int n1,int n2){
    int value =0;
    if(currentNode == null){
      return -1;
    }
    if(n1>n2){
      swap(n1,n2);
    }
    if((currentNode.data>n1)&&(currentNode.data>n2)){
        value =  findLCA(currentNode.left,n1,n2);
    }
    if((currentNode.data<n1)&&(currentNode.data<n2)){
      value =  findLCA(currentNode.right,n1,n2);
    }
    if((currentNode.data>n1) && (currentNode.data <n2)){
      return currentNode.data;
    }
    if((currentNode.data == n1) || (currentNode.data == n2)){
      return currentNode.data;
    }

    return value;

  }

  public static void swap(int n1,int n2){
    int temp = n1;
    n1 = n2;
    n2 =temp;
  }

  private static TreeNode root;
  class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    private TreeNode(int data){
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public void createSampleTree(){
    root = new TreeNode(5);
    root.left = new TreeNode(2);
    root.right = new TreeNode(6);
    root.left.left = new TreeNode(0);
    root.left.right = new TreeNode(3);
    root.left.left.right = new TreeNode(1);
    root.right.right  = new TreeNode(9);
    root.right.right.left = new TreeNode(7);
    root.right.right.left.right = new TreeNode(8);
   }
}
