public class TestLinkedList {
    public static void main(String[] ar) {
	Node h = new Node(1);
	Node t = new Node(2);	
	LinkedL ll = new LinkedL(h,t);
	ll.show_list();
	ll.add_to_head(new Node(10));
	ll.show_list();
	ll.add_to_tail(new Node (3));
	ll.show_list();
	ll.remove_node(h);
	ll.show_list();	
    }
}
