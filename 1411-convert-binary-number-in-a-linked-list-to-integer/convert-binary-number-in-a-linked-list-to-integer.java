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
    public int getDecimalValue(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode temp = head;

        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = list.get(i);
        }

        int ans = binaryToDecimal(arr);

        return ans;
        
    }

    public int binaryToDecimal(int arr[]){
        // int arr[] = intToArr(binNum);
        int n = arr.length;
        int idx = 0;
        int prod = 0;
        
        for(int i = n-1; i >= 0; i--){
            int num = arr[i];
            double powerProd = Math.pow(2,idx);
            idx++;
            prod = prod + (int)(powerProd*num); 
        }

        return prod;

        
    }

    public int[] intToArr(int num){
        int copy = num;
        int numOfDigits = 0;
        while(copy >= 0){
            int rem = copy%10;
            numOfDigits++;
            copy = copy/10;
        }

        int arr[] = new int[numOfDigits];
        copy = num;
        for(int i = 0; i < numOfDigits; i++){
            while(copy >= 0){
                int rem = copy%10;
                arr[i] = rem;
                copy = copy/10;
            }
        }

        return arr;
    }
}