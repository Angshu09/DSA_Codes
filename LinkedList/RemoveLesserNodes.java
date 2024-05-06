package revise_DSA.LinkedList;

//https://leetcode.com/problems/remove-nodes-from-linked-list/

public class RemoveLesserNodes {
//    public ListNode removeNodes(ListNode head) {
//        head = reverse(head);
//
//        int max = head.val;
//        ListNode curr = head.next;
//        ListNode prev = head;
//
//        while(curr != null){
//            if(curr.val >= max){
//                prev = curr;
//                max = curr.val;
//            }
//            else{
//                prev.next = curr.next;
//            }
//            curr = curr.next;
//        }
//
//        head = reverse(head);
//
//        return head;
//    }
//
//    public ListNode reverse(ListNode head){
//        ListNode curr = head;
//        ListNode prev = null;
//        ListNode temp = null;
//
//        while(curr != null){
//            temp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = temp;
//        }
//
//        return prev;
//    }
}
