class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int last = n-1;
        for(int i = n-2; i>=0; i--){
            if(nums[i] + i >= last){
                last = i;
            }
        }
        if( last <= 0){
            return true;
        }else{
            return false;
        }
    }
}