package LeetCodeProblemUsingJava;


// Question 61: Rotate List
// Link : https://leetcode.com/problems/rotate-list/description/
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
public class Question61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null) return head;
        int length=1;
        ListNode dummy=head;
        while(dummy.next!=null){
            dummy=dummy.next;
            length+=1;
        }
        if (k% length==0){
            return head;
        }
        ListNode cur=head;
        for(int i=0;i<(length-(k%length)-1);i++){
            cur=cur.next;
        }
        ListNode new_head=cur.next;
        cur.next=null;
        dummy.next=head;
        return new_head;
    }
}