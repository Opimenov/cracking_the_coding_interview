public class Urlify {
    static char[] test(char[] s) {
	if (s == null) return null;
	boolean onBackSide = true;
	int i =  s.length-1, j =  s.length-1;
	while ( i>=0 && j>=0 ) {
	    	System.out.println("i="+i+ "  j="+j);
		while (s[j] == ' ' && onBackSide) {j-- ; }
		if (s[j] == ' ' && !onBackSide) {
		    s[i--] = '0';
		    s[i--] = '2';
		    s[i--] = '%';
		    j--;
		}
		else {
		    onBackSide = false;
		    s[i--] = s[j--];
		    //		    s[j--] = ' ';
		    if (j >= 0 && i >= 0)
			System.out.println(s);		
		}
	}
	return s;
    }
    public static void main(String a[]) {
	char[] s1 = "Mr Jhon Snow    ".toCharArray();
	System.out.println(s1);
	char[] s2 = Urlify.test(s1);
	System.out.println(s2);	
    }
}
