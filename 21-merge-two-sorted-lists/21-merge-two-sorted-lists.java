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
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        ListNode answer;
        if (list1.val <= list2.val) {
            answer = list1;
            return merge(list1, list2, answer);
        } else {
            answer = list2;
            return merge(list2, list1, answer);
        }
    }
    
    // Recursive
    public ListNode merge(ListNode list1, ListNode list2, ListNode merged) {
        if (list1 == null || list2 == null) {
            return merged;
        }
        ListNode tmp1 = list1;
        ListNode tmp2 = list2;
        
        if (list1.val <= list2.val) {
            while (!(tmp1.next == null) && tmp1.next.val <= tmp2.val) {
                tmp1 = tmp1.next;
            } 
            list1 = tmp1;
            tmp1 = list1.next;
            list1.next = list2;
        } else {
            while (!(tmp2.next == null) && tmp2.next.val <= tmp1.val) {
                tmp2 = tmp2.next;
            } 
            list2 = tmp2;
            tmp2 = list2.next;
            list2.next = list1;
        }
        list1 = tmp1;
        list2 = tmp2;
        return merge(list1, list2, merged);
    }
}