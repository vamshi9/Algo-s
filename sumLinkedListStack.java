import java.util.*;
public class sumLinkedListStack{
  class ListNode{
     int value;
     ListNode next;
     private ListNode(int value){
        this.value = value;
     }
  }
  ListNode head;
  ListNode tail;

  public ListNode createLinkedList(int arr[]){
    if(head!=null){
      head = null;
    }
    int l =arr.length;
    for(int i=0;i<l;i++){
         appendNode(arr[i]);
    }
    return head;
  }

  public void appendNode(int value){
    if(head==null){
      head = new ListNode(value);
      tail = head;
    }
    tail.next = new ListNode(value);
    tail = tail.next;
  }

  public void printList(ListNode head){
        ListNode temp = head;
       while(temp!=null){
         System.out.print(temp.value + "->");
         temp = temp.next;
       }
       System.out.print("null");
  }
  public static void main(String[] args) {
      sumLinkedListStack obj = new sumLinkedListStack();
      int arr1[] = new int[]{9,9,9,7,1};
      int arr2[] = new int[]{9,9,8};
      ListNode head1 = obj.createLinkedList(arr1);
      ListNode head2 = obj.createLinkedList(arr2);
      ListNode head;
      if(arr1.length>arr2.length)
          head = obj.findSum(head1,head2,arr1.length);
      else
          head = obj.findSum(head2,head1,arr2.length);

      obj.printList(head);
  }
  ListNode temp;
  public ListNode findSum(ListNode head1,ListNode head2,int l){
      temp = head1;
      Stack<ListNode> s1 = new Stack<ListNode>();
      Stack<ListNode> s2 = new Stack<ListNode>();
      while(temp!=null){
         s1.push(temp);
         temp = temp.next;
      }
      temp = head2;
      while(temp!=null){
        s2.push(temp);
        temp = temp.next;
      }
      Stack<Integer> s3 = new Stack<Integer>();
      int sum = 0,carry=0;
      while(l!=0){
        if(!s2.isEmpty()){
          sum = s1.pop().value + s2.pop().value + carry;
          s3.push(sum%10);
          carry = sum/10;
          l--;
        }else{
          sum = s1.pop().value + carry;
          s3.push(sum%10);
          carry = sum/10;
          l--;
        }
      }
      if(carry>0){
        s3.push(carry);
      }
      ListNode head;
      ListNode temp;
      head = new ListNode(s3.pop());
      temp = head;
      while(!s3.isEmpty()){
          temp.next =new ListNode(s3.pop());
          temp = temp.next;
      }
      return head;
  }
}
