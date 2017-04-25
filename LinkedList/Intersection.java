import java.lang.Math;
import java.lang.System;
public class Intersection {
    public static Node intersection(LinkedL l1, LinkedL l2) {
	if (l1 == null || l2 == null)  return null;
	int len_dif = Math.abs(l1.size - l2.size);
	Node h1 = l1.head;
	Node h2 = l2.head;
	// advance head pointer of the longer list forward 
	//so the lists have the same length
	if (l1.size > l2.size) 
	    for (int i = 0; i<len_dif; i++)  h1 = h1.next;
	else 
	    for (int i = 0; i<len_dif; i++) 
		h2 = h2.next;
	//traverse the lists and compare Nodes
	
	while (h1.next != null) {
	    if (h1 == h2) return h1;
	    h1 = h1.next;
	    h2 = h2.next;
	}
	return null;
    }
    public static void main(String[] ar) {
	Node h = new Node(1);
	Node t = new Node(2);
	System.out.println(t);
	LinkedL l1 = new LinkedL(h,t);
	l1.add_to_head(new Node(10));
	l1.add_to_tail(new Node (3));
	l1.add_to_tail(new Node (3));
	l1.add_to_tail(new Node (3));
	l1.add_to_tail(new Node (3));	
	l1.show_list();
	Node u = new Node(1);
	Node v = new Node(2);	
	LinkedL l2 = new LinkedL(u,v);
	l2.add_to_head(new Node(10));
	l2.add_to_tail(new Node (3));
	l2.add_to_tail(new Node (3));
	l2.add_to_tail(new Node (3));
	l2.add_to_tail(t);	
	l2.show_list();
	System.out.println(Intersection.intersection(l1,l2));
    }
}
