package minhduc.training.leetcode;

public class _344_Reverse_String {
    
	public void reverseString(char[] s) {
        int j = s.length -1;
        for(int i = 0; i < s.length; i++) {
        	char c = s[i];
        	s[i] = s[j];
        	s[j] = c;
        	j--;
        	if(j<=i) break;
        }
        for(char c: s) {
        	System.out.println(c);
        };
    }
}
