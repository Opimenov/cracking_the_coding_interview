public class LinkedL {
    Node head;
    Node tail; 
    int size;


    public LinkedL(Node head, Node tail) {
	this.head = head;
	this.head.next = tail;
	this.tail = tail;
	this.tail.prev = head;
	this.size = 2;
    }

    public void add_to_tail(Node new_tail) {
	Node old_tail = this.tail;
	new_tail.prev = old_tail;
	old_tail.next = new_tail;
	this.tail = new_tail;
	this.size++;
    }

    public void add_to_head(Node new_head) {
	Node old_head = this.head;
	new_head.next = old_head;
	old_head.prev = new_head;
	this.head = new_head;
	this.size++;
    }

    public void remove_head() {
	this.head = head.next;
    }

    public void remove_node(Node d) {
	d.prev.next = d.next;
    }

    public void show_list() {
	Node cur = this.head;
	while(cur != null) {
	    System.out.printf(" | %d | ",cur.data);
	    cur = cur.next;
	}
	System.out.println();
    }
}
