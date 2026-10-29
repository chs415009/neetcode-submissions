class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int lmax = heights[l];
        int rmax = heights[r];
        int amax = (r - l) * Math.min(lmax,rmax);
        while(l < r){
            if(amax < (r - l) * Math.min(heights[l], heights[r])){
                amax = (r - l) * Math.min(heights[l], heights[r]);
            }
            


            if(heights[l] <= heights[r]){
                l++;
            } else {
                r--;
            }

        }
        return amax;
    }
}
