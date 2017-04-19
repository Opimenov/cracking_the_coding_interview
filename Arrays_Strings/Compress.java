import java.lang.StringBuilder;

public class Compress{
    public static String compress(String s){
	if (s == null) return null;
	int c = 1;
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < s.length(); i++) {
	    if (i < s.length() -1) {
		// check the edge case when
		//you are at the end and need to count the last char
		if (s.charAt(i) == s.charAt(i+1)) {
		    c++;
		}
		else {
		    sb.append(s.charAt(i));
		    sb.append(c);			      
		    c = 1;
		}
	    }
	    else {
		//we are at the last character
		if (c != 1) {
		    sb.append(s.charAt(i));
		    sb.append(c);		    
		}
		else {
		    //we are in this situation
		    // aaabbbccd -> a3b3c2d1
		    sb.append(s.charAt(i));
		    sb.append(c);		    
		}
	    }
	}
	return (sb.length() < s.length()) ?  sb.toString() : s;
    }
    public static void main(String arg[] ) {
	System.out.print("aaabbbcccdd ::=> ");
	System.out.println(Compress.compress("aaabbbcccdd"));
	System.out.print("aaabbbcccd  ::=> ");
	System.out.println(Compress.compress("aaabbbcccd"));
	System.out.print("ad  ::=> ");
	System.out.println(Compress.compress("ad"));
	System.out.print("add ::=> ");
	System.out.println(Compress.compress("ad"));			
	
    }
}
