public class  OneAway {
    /*
      insert char krot -> krote
      remove char krot -> kro
      replace char krot -> drot

      figure out if two string are one/zero operations away
    */
    static boolean test(String s1, String s2) {
	if (s1 == null || s2 == null ||
	    //difference in length is greater than 1
	    ( s1.length() - s2.length() > 1)
	  || ( s1.length() - s2.length() < -1) ) return false;
	else if (s1 == s2) return true;

	boolean insOccured = false;
	boolean delOccured = false;	
	boolean oneOp = false;
	boolean secondOp = false;
	////////// CASE 1 //////////////////
	//difference in length() is 1
	//inserte case. Now if chars don't match we look
	//forward one char
	if ( s1.length() - s2.length() == -1) {
	    insOccured = true;
	}
	////////// CASE 2 //////////////////	
	//deletion case. Now if chars don't match we look
	//back one char
	if ( s1.length() - s2.length() == 1) {
	    delOccured = true;
	}
	////////// CASE 3 //////////////////	
	//otherwise strings are equal in length
	//so we only compare char at the same indecies

	int i = 0; 
	while (i < s1.length()()) {
	    if (insOccured) {//insertion
		if (s1.charAt(i) != s2.charAt(i) ) {
		    if (s1.charAt(i) != s2.charAt(i+1) ) {
			return false;
		    }
		    i++;
		    continue;
		}
	    }
	    if (delOccured) { //deletion
		if (s1.charAt(i) != s2.charAt(i) ) {
		    if (i < s1.length())
			if (s1.charAt(i+1) != s2.charAt(i) ) {
			    return false;
			}
		    i++;
		    continue;
		}
	    }
	    else {
		if (s1.charAt(i) != s2.charAt(i)) {
		    if (oneOp) return false;
		    else {
			oneOp = true;
		    }
		}
	    }
	}
	
	return true;
    }
       
      
    public static void main(String a[]) {
	System.out.println(OneAway.test("krot", "krot"));
	System.out.println(OneAway.test("krot", "kro"));
	System.out.println(OneAway.test("krot", "krote"));
	System.out.println(OneAway.test("krot", "krat"));	
    }
}
