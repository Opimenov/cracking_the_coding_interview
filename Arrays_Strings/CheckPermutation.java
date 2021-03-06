import java.util.Arrays;
public class  CheckPermutation {
    static boolean checkPerm(String s1, String s2) {
	/*
*************************************
histogramic implementation
*************************************
	  if (s1 == null || s2 == null || s1.length() != s2.length()) return false;
	int[] s1_hist = new int[94];
	int[] s2_hist = new int[94];
	for (int i = 0; i < s1.length(); i++) {
	    s1_hist[((int) s1.charAt(i)) - 32] += 1;
	    s2_hist[((int) s1.charAt(i)) - 32] += 1;	    
	}
	for (int r : s1_hist) System.out.print(r);
	System.out.println();	
	for (int r : s2_hist) System.out.print(r);
	System.out.println();	
	return Arrays.equals(s2_hist, s1_hist);
	*/
/*************************************
using array.sort function
*************************************/
	char[] s1ar =s1.toCharArray();
	char[] s2ar = s2.toCharArray();
	Arrays.sort(s1ar);
	Arrays.sort(s2ar);		
	return Arrays.equals(s1ar, s2ar);
    }
      
    public static void main(String a[]) {
	System.out.println("sas ass  -->>> ");
	System.out.println(CheckPermutation.checkPerm("sas", "ass"));		
	System.out.println(CheckPermutation.checkPerm("asdfadvvnaoiwejaw8a74525352", "asdfadvvnaoiwejaw8a74525325"));	
    }
}
