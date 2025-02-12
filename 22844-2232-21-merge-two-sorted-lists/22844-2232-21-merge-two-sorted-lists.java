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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null)return list2;
        if(list2 == null)return list1;

        ListNode ans = null;
        ListNode t = null;

        if(list1.val < list2.val){
            ans = list1;
            t = list1;
            list1 = list1.next;
        } 
        else{
            ans = list2;
            t = list2;
            list2 = list2.next;
        }


        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                t.next = list1; // h1 (list1) zyada chhota tha comparison mei, toh current node(t) ke next usse bana diya.
                t = t.next; //now t is h1 as well, as h1 is the curr node right now
                list1 = list1.next; //for future, h1 ko h1.next mei daal diya. As we compare future nodes.
            }
            else{
                t.next = list2;
                t = t.next;
                list2 = list2.next;
            }

        }

        if(list1!=null)t.next = list1;
        if(list2!=null)t.next = list2;

        return ans;
        
    }
}