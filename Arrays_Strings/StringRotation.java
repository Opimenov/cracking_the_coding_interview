public class StringRotation {
    public static boolean isSubstring(String s1, String s2) {
	if ((s1.length() != s2.length()) ||
	    (s1 == null || s2 == null)) return false;
	//	boolean [] ind_check = new boolean[s2.length()];
	int previousIndex = -1;
	int foundCharAt = -1;
	int mustBeAt = -1;
	for (char c : s1.toCharArray()) {
	    //first time execute the following
	    if (previousIndex == -1) {
		previousIndex = s2.indexOf(c);
		//System.out.printf("current char %c previousIndex %d\n",c,previousIndex);
	    }
	    else {
		//System.out.printf("current char %c previousIndex %d\n",c,previousIndex);
		//let's find what the index of the next char should be
		if (previousIndex == s2.length() -1)
		    mustBeAt = 0;
		else 
		    mustBeAt = previousIndex + 1;
		//compare real index with mustBe
		//System.out.printf("mustBeAt %d  but is at %d\n\n",mustBeAt,s2.indexOf(c));
		if(s2.charAt(previousIndex) == s2.charAt(mustBeAt)) {
		    previousIndex = mustBeAt;
		    continue;
		}
		if (mustBeAt != s2.indexOf(c)) return false;
		previousIndex = mustBeAt;
	    }
	}
	return true;
    }
    public static void main(String[] ar) {
	String s1 = "hello";
	for (char c : s1.toCharArray()) {
	    //	    System.out.print(c);
	}
	System.out.println("hello  llohe");		
	System.out.println(StringRotation.isSubstring("hello","llohe"));
	System.out.println("helo  lohe");		
	System.out.println(StringRotation.isSubstring("helo","lohe"));
	System.out.println("heo  heo");		
	System.out.println(StringRotation.isSubstring("heo","heo"));
	System.out.println("ello  llohe");		
	System.out.println(StringRotation.isSubstring("ello","llohe"));
	System.out.println("he llo  llohe ");		
	System.out.println(StringRotation.isSubstring("he llo","llohe "));	



    
    }
}
