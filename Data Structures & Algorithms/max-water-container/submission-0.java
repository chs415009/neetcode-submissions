class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int lmax = heights[l];
        int rmax = heights[r];
        int amax = (r - l) * Math.min(lmax,rmax);
        while(l < r){

            if(heights[l] > lmax){
                lmax = heights[l];
                amax = Math.max(amax, (r - l) * Math.min(lmax,rmax));
            } else if(heights[r] > rmax){
                rmax = heights[r];
                amax = Math.max(amax, (r - l) * Math.min(lmax,rmax));
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
