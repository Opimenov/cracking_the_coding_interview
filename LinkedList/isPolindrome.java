import java.util.Stack;
public class isPolindrome {
    public static boolean check_if_polindrome(LinkedL ll) {
	//check the argument 
	if (ll == null) return false;
	if (ll.size == 1) return true;

	Stack<Node> stack = new Stack<>();
	int counter = 0;
	int middle = ll.size / 2;
	Node current = ll.head;
	Node out;
	while(counter < ll.size) {
//System.out.printf("counter :%d  middle :%d  ll.size :%d\n",counter,middle,ll.size);
	    while(counter <= middle) {
//System.out.printf("current data => %d \n",current.data);		    		
		if (counter == middle) {
//System.out.printf("is odd => %b \n",(ll.size % 2) != 0);	
		    if ((ll.size % 2) != 0) {
			//skip the middle node
			current = current.next;
		    }
		}
		else {
//System.out.printf("adding :: %d\n",current.data);
		    stack.push(current);
		    current = current.next;
		}

		counter++;
	    }
	    out = stack.pop();
//System.out.printf("current data :%d  out data :%d\n",current.data, out.data);
	    if (current.data != out.data) return false;
	    current = current.next;
	    counter++;
//System.out.printf("counter :: %d \n",counter);
	}
	return true;
    }
    public static void main(String[] ar) {
	Node h = new Node(1);
	Node t = new Node(2);	
	LinkedL ll = new LinkedL(h,t);
	ll.add_to_tail(new Node(2));
	ll.add_to_tail(new Node (1));
	ll.show_list();
	System.out.printf("should be true :: %b \n",
			  isPolindrome.check_if_polindrome(ll));
	ll = new LinkedL(h,t);
	ll.add_to_tail(new Node (1));	
	ll.add_to_tail(new Node(2));
	ll.add_to_tail(new Node (1));
	ll.show_list();
	System.out.printf("should be true :: %b \n",
			  isPolindrome.check_if_polindrome(ll));
	ll = new LinkedL(h,t);
	ll.add_to_tail(new Node (1));	
	ll.add_to_tail(new Node(1));
	ll.add_to_tail(new Node (1));
	ll.show_list();
	System.out.printf("should be false :: %b \n",
			  isPolindrome.check_if_polindrome(ll));
	
    }
}
