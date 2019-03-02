package p2_AddTwoNumbers;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode initial = new ListNode(0);
        ListNode newList = initial;

        ListNode t1 = l1;
        ListNode t2 = l2;
        int tmp = 0, sum = 0;
        while(t1 != null || t2 != null){
            sum = tmp;
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }
            if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }
            sum += tmp;
            if(sum > 9){
                tmp = 1;
                sum -= 10;
            }else
                tmp = 0;
            ListNode node = new ListNode(sum);
            newList.next = node;
            newList = newList.next;
        }
        if(tmp > 0){
            ListNode node = new ListNode(tmp);
            newList.next = node;
        }
        return initial.next;
    }
}