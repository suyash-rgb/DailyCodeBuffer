package gfg_160;

import org.w3c.dom.Node;

/*
Given the head of a linked list, the task is to reverse this list and return the reversed head.
 */
public class Day65_ReverseALinkedList {
    public static void main(String[] args) {

    }
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        while(head!=null){
            Node next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
}
