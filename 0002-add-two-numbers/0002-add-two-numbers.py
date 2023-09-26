# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        sum = ListNode(0, None)
        point = sum
        while l1 and l2:
            temp = l1.val + l2.val + carry
            carry = temp // 10
            temp = temp % 10
            point.next = ListNode(temp, None)
            point = point.next
            l1 = l1.next
            l2 = l2.next
        
        if (l1 != None):
            while l1:
                temp = l1.val + carry
                carry = temp // 10
                temp = temp % 10
                point.next = ListNode(temp, None)
                point = point.next
                l1 = l1.next
        elif (l2 != None):
            while l2:
                temp = l2.val + carry
                carry = temp // 10
                temp = temp % 10
                point.next = ListNode(temp, None)
                point = point.next
                l2 = l2.next
        
        if carry != 0 :
            point.next = ListNode(carry, None)
    
        return sum.next
        