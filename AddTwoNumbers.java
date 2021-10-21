
//  Definition for singly-linked list.
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class AddTwoNumbers {
  
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int pCarry = 0,carry = 0 ,sum,value;
        
           ListNode head = new ListNode(0);
           ListNode p = l1, q=l2;
           ListNode temp = head;
           
           while(p != null  || q != null)
           {       
                 int x = (p!=null)?p.val:0;
                 int y = (q!=null)?q.val:0;
               
                 sum = x + y + pCarry;
               
                if( sum >= 10)
                {
                    carry = 1;
                    value = sum%10;
                }
                else
                {
                    carry = 0;
                    value = sum;
                }
               
          
                temp.next = new ListNode(value,null);
                temp = temp.next;
                 
                 if(p!=null) p = p.next;
                 if(q!=null) q = q.next;
               
                pCarry = carry;
           }
        
          if(pCarry == 1)
          {
              temp.next = new ListNode(pCarry);
              temp = temp.next;
          }
        
        return head.next;
    }
}