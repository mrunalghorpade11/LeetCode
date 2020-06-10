/*
Problem Statement: Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
Example : Given linked list -- head = [4,5,1,9] node-5
Output : [4,1,9]

Note:
- The linked list will have at least two elements.
- All of the nodes' values will be unique.
- The given node will not be the tail and it will always be a valid node of the linked list.
- Do not return anything from your function.
*/

/** public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
  */
class DeleteNodeInLinkedList {
    public void deleteNode(ListNode node) {
        ListNode ptr = node;
        int count = 0;
        while(node.next!=null)
        {
            node.val = node.next.val;
            node = node.next;
            ++count;
            if(count!=1)
            {
                ptr = ptr.next;
            }
        }
        ptr.next = null; 
    }
}