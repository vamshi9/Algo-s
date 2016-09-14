import java.util.*;
public class DetectLinkedListLoop{
  ListNode head;
  static class ListNode{
       int data;
       ListNode next;
       ListNode(int data){
         this.data = data;
         next = null;
       }
  }

  public static void main(String[] args) {
    DetectLinkedListLoop obj = new DetectLinkedListLoop();
    ListNode head = obj.createLinkedList();
    int number  = obj.detectLoop(head);
    System.out.println(number);
  }

  public static ListNode createLinkedList(){
    ListNode head = new ListNode(8);
    head.next = new ListNode(9);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(2);
    head.next.next.next.next.next = new ListNode(3);
    head.next.next.next.next.next.next = new ListNode(7);
    head.next.next.next.next.next.next.next = new ListNode(9);
    head.next.next.next.next.next.next.next.next = head.next.next.next.next;
    return head;
  }

  public static int detectLoop(ListNode head){
    if(head==null){
      return -1;
    }
    ListNode slow = head;
    ListNode fast = head;
    do{
      slow = slow.next;
      fast = fast.next.next;
    }while(slow!=fast);
    return findLoopPoint(head,fast);
  }

  public static int findLoopPoint(ListNode slow,ListNode fast){
   while(slow!=fast){
     slow = slow.next;
     fast = fast.next;
   }
   return slow.data;
  }


}
