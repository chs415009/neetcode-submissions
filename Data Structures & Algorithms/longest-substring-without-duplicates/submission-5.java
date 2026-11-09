class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();

        char[] cs = s.toCharArray();
        int head = 0;
        int len = 0;
        for(int i = 0; i < cs.length; i++){
            if(!map.containsKey(cs[i])){                
                len++;
            } else {
                ans = Math.max(ans, len);
                int re = map.get(cs[i]);
                if(head <= re){
                    head = re +1;
                    len = i - head +1;
                } else {
                    len++;
                }
            }
            map.put(cs[i],i);
        }

        ans = Math.max(ans, len);
        return ans;
    }
}
