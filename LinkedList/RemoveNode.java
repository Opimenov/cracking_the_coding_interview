public class RemoveNode {
    public static void remove_node(LinkedL ll, Node n) {
	if (ll.size < 3 || ll == null || n == null) 
	                                           return;
	Node cur = ll.head;
	while (cur.next != null) {
	    if (cur.next == n) {
		cur.next = n.next;
		return;
	    }
	    cur = cur.next;
	}
    }
    public static void main(String[] ar) {
	Node some = new Node(99);
	LinkedL ll = new LinkedL(some, new Node(1));
	ll.add_to_tail(new Node(2));
	ll.add_to_head(new Node(-1));	
	// ll.add(2);
	// ll.add(2);
	// ll.add(3);
	// ll.add(0);
	ll.show_list();
	RemoveNode.remove_node(ll,some);
	System.out.println();
	ll.show_list();	
    }
}
