package minhduc.training.leetcode;

public class _28_Implement_strStr {

    public int find(String haystack, String needle) {
    	
    	if(haystack.length() < needle.length()) return -1;
    	if(haystack.length()==0 || needle.length()==0) return 0;
    	
    	char[] h = haystack.toCharArray();
    	char[] n = needle.toCharArray();
    	
    	for(int i = 0; i + n.length<=h.length;i++) {
    		if(h[i] == n[0] && h[i+n.length-1] == n[n.length-1]) {
    			boolean check = true;
    			for(int j = i+1,k=1; k<n.length; j++,k++) {
    				if(h[j] != n[k]) {
    					check =false;
    					break;
    				}
    			}
    			if(check) return i;
    		}
    	}
    	
    	return -1;
    }

	
}
