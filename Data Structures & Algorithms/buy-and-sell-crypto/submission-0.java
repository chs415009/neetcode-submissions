class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int pro = 0;
        for(int p: prices){
            min = Math.min(min, p);
            pro = Math.max(pro,p-min);
        }
        return pro;
    }
}
