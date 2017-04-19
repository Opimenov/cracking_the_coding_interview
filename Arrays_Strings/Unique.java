import java.util.HashMap;
import java.lang.*;
import java.util.*;
public class  Unique {
    //determines if all chars are unique
    static boolean unique(String s) {
/*
          ***************************
	  implementation using hash map
	  ***************************	  
	boolean result = true;
	if (s1 == null) return false;
	boolean[] alphabet = new boolean[94];
	
	for (char c : s1.toCharArray() ) {
	    if (alphabet[((int) c) - 32]) {
		result = false;
		break;
	    }
	    else alphabet[((int) c) - 32] = true;
	}
	alphabet = null;
	System.gc();
	return result;
    }

          ***************************
	      using array of boolean
	  ***************************	  
	
	s = s.toLowerCase();
	boolean[] letters = new boolean[26];
	for (char c : s.toCharArray()) {
	    int at = Character.getNumericValue(c) - Character.getNumericValue('a');
	    if (letters[at]) return false;
	    else letters[at] = true;
	}
	return true;
*/
          /***************************
           using sorting and looking at
           the last char
	  ***************************/
	s = s.toLowerCase();
	char[] l = s.toCharArray();
	Arrays.sort(l);	
	for (int i = 0; i < l.length -1; i++) {
	    if (l[i] == l[i+1]) return false;
	}
	return true;
    }


	
    public static void main(String a[]) {
	System.out.print("Sasha :: ");
	System.out.println(	Unique.unique("Sasha"));
	System.out.print("Pimenov :: ");
	System.out.println(	Unique.unique("Pimenov"));
	System.out.print("Empty string :: ");	
	System.out.println(	Unique.unique(""));
	System.out.print("Sah S :: ");	
	System.out.println(	Unique.unique("SahS"));
    }
}
