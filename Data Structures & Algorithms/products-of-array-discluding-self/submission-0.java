class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans, 1);

        int left = 1;
        for(int i = 1; i < nums.length; i++){
            left *= nums[i-1];
            ans[i] *= left;
        }

        int right = 1;
        for(int i = nums.length-2; i >= 0; i--){
            right *= nums[i+1];
            ans[i] *= right;
        }

        return ans;
    }
}  
