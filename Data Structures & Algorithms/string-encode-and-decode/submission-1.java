class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slashIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, slashIndex));
            list.add(str.substring(slashIndex + 1, slashIndex + 1 + len));
            i = slashIndex + 1 + len;
        }
        return list;
    }
}
