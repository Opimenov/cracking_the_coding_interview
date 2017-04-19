import java.util.*;
/*
SUPER INEFFICIENT

GOTTA COME BACK TO IT AND IMPROVE
 */
public class RemoveDups {
    public static void removeDups(LinkedList<Integer> ll) {
	if (ll == null || ll.isEmpty()) {
	    return;
	}
	Hashtable<Integer,Integer> ht = new Hashtable<>();
	for (int i = 0; i < ll.size(); i++) {
	    if (ht.containsKey(ll.get(i))) {
		ll.remove(i);
	    } else {
		ht.put(ll.get(i), 0);
	    }
	}
    }
    public static void main(String[] ar) {
	LinkedList<Integer> ll = new LinkedList<Integer>();
	ll.add(0);
	ll.add(1);	
	ll.add(2);
	ll.add(2);
	ll.add(3);
	ll.add(0);
	for (int i = 0; i < ll.size(); i++) {
	    System.out.println(ll.get(i));
	}
	RemoveDups.removeDups(ll);
	System.out.println();
	for (int i = 0; i < ll.size(); i++) {
	    System.out.println(ll.get(i));
	}
    }
}
