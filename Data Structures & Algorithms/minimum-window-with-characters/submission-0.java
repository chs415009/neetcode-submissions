class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        
        int[] freq = new int[123];
        for(char c: t.toCharArray()){
            freq[c]++;
        }

        int start = 0;
        int len = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int count = t.length();

        while(r<s.length()){
            char c = s.charAt(r);
            if(freq[c]>0) count--;
            freq[c]--;
            r++;

            while(count == 0){
                if(r-l < len){
                    len = r-l;
                    start = l;
                }
                
                char lc = s.charAt(l);
                freq[lc]++;
                if(freq[lc]>0) count++;
                l++; 
            }
        }

        return len==Integer.MAX_VALUE ? "" :s.substring(start,start+len);
    }
}
