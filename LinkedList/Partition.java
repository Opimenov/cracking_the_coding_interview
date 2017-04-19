public class Partition {
    public static void partition(LinkedL ll, Node pivot) {
	if (ll.size < 3 || ll == null || pivot == null) return;
	Node r = ll.head;
	while (r.next != null) {
	    if (r.data < pivot.data) {
		ll.remove_node(r);
		ll.add_to_head(r);
	    }
	    r = r.next;
	}
    }
    public static void main(String[] ar) {
	Node h = new Node(1);
	Node t = new Node(2);	
	LinkedL ll = new LinkedL(h,t);
	ll.show_list();
	ll.add_to_head(new Node(10));
	ll.show_list();
	ll.add_to_tail(new Node (3));
	ll.show_list();
	Partition.partition(ll,t);
	ll.show_list();
    }
    
}
