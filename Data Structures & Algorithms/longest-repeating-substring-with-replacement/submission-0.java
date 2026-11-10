class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int m = 0;
        int[] count = new int[26];
        
        while(r < s.length()){
            char c = s.charAt(r);
            count[c-'A']++;
            m = Math.max(m, count[c-'A']);
            
            if(r-l+1 - m > k){
                count[s.charAt(l)-'A']--;
                l++;
            }

            r++;
        }

        return r-l;
    }
}
