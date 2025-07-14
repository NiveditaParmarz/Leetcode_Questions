/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null)return head;
        if(head.next==null)return head;
        
        ListNode temp = head;
        while(temp != null && temp.next != null){
            ListNode curr = temp;
            ListNode nextNode = temp.next;
            ListNode newNode = new ListNode(gcd(curr.val,nextNode.val));
            curr.next = newNode;
            newNode.next = nextNode;
            temp = nextNode;
        }
        return head;
        
    }

    public int gcd(int a, int b){
        if(a==0)return b;
        int temp = gcd(b%a,a);
        return temp;
    }
}