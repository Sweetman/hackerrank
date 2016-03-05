/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node new_list = null;
    while(head != null){
      Node element = head;
      head = head.next;

      element.next = new_list;
      new_list = element;
    }
    
}
