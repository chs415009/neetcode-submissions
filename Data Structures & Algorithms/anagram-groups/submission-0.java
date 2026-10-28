class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] arr = new int[26];
            for(char c:s.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int a:arr){
                sb.append("#"+a);
            }
            String ss = sb.toString();
            if (!map.containsKey(ss)) {
                map.put(ss, new ArrayList<>());
            }
            map.get(ss).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
