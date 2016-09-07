import java.util.*;
public class NthNode{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    NthNode obj = new NthNode();
    obj.createLinkedList();
    int number = obj.findNthNode(n);
    System.out.println(number);
  }

  public int findNthNode(int n){
    ListNode node1 = head;
    ListNode node2 =head;
    int count=1;
    while(node1!=null){
      if(count == (n+1)){
        break;
      }
      node1 = node1.next;
      count+=1;
    }
    if(count == (n+1)){
      while(node1!=null){
        node1=node1.next;
        node2=node2.next;
      }
    }
    return node2.value;

  }

  public class ListNode{
    int value;
    ListNode next;
    private ListNode(int value){
      this.value = value;
    }
  }
  ListNode head;
  public void createLinkedList(){
    if(head!=null){
      head = null;
    }
    for(int i=1;i<=9;i++){
        append(i);
    }
  }
  ListNode tail;
  public void append(int i){
    if(head==null){
      head = new ListNode(i);
      tail = head;
      return;
    }
    ListNode n = new ListNode(i);
    tail.next = n;
    tail = n;
  }
}
