package com.generics;

class Node<T>{
     T data;
	Node next;
	
	   public Node(T data)
	   {
		   this.data=data;
		   next=null;
	   }
}
class LinkedList<T>
{
	Node head=null;
    public void insertAtBeg(T a)
    {
 	   Node n1=new Node(a);
 	   if(head==null)
 		   head=n1;
 	   else
 		   n1.next=head;
 	       head=n1;
    }
   
    
    void displayList()
    {
 	   Node start=head;
 	   while(start!=null)
 	   {
 		   start=start.next;
 	   }
 	   
    }
}
public class LinkedListMaster {
	 public static void main(String[] args) {
		    LinkedList l1 = new LinkedList();
		    l1.insertAtBeg(10);
		    l1.insertAtBeg(20);
		    l1.insertAtBeg(30);
		    l1.insertAtBeg(40);
		    l1.displayList();
}
}
