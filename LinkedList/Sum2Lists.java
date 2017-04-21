public class Sum2Lists {
    public static LinkedL sum2lists(LinkedL l1, LinkedL l2) {
	/**
	 in this example two lists store numbers in order:
	 0 -> 3 -> 2 -> 5      ==>  523
	 9 -> 4 -> 6 -> 4      ==> 4649
	 since two lists have different length I think it's a good idea
	 to pad short list with zeros

	 after long investigation))))) 
	 I've concluded that the list should represent the number in reverse
	 order. Otherwise it becomes really painfull.
	 */
	LinkedL resList = new LinkedL(new Node(0), new Node(0));
	Node l1C = l1.head;
	Node l2C = l2.head;
        int carry = 0;
	while (l1C != null) {
	    int num = l1C.data + l2C.data;
	    if (carry != 0) {
		num = num + carry;
		carry = 0;
	    }	    
	    if (num > 9) {
		num = num % 10;
		carry = 1;
	    }
	    resList.add_to_tail(new Node(num));
	    l1C = l1C.next;
	    l2C = l2C.next;				
	}
	if (carry != 0) {
	    resList.add_to_tail(new Node(1));
	}
	resList.remove_head();
	resList.remove_head();	
	return resList;
    }
    /**
       appends n zeros to the ll
     */
    public static void padWithZeros(LinkedL ll, int n) {
	while (n-- > 0) {
	    ll.add_to_tail(new Node(0));
	}
    }
    public static void main(String[] ar) {
	Node h = new Node(3);
	Node t = new Node(2);	
	LinkedL ll = new LinkedL(h,t);
	ll.add_to_tail(new Node (5));
	//ll.show_list();

	h = new Node(9);
	t = new Node(4);	
	LinkedL l2 = new LinkedL(h,t);
	l2.add_to_tail(new Node (6));
	l2.add_to_tail(new Node (4));
	l2.show_list();
	System.out.println();

	Sum2Lists.padWithZeros(ll,l2.size - ll.size);
	ll.show_list();
	System.out.println();	
	Sum2Lists.sum2lists(ll,l2).show_list();
    }
    
}
