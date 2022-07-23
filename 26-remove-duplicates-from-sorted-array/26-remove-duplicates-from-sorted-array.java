class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 0;
        nums[j++]  = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]!=nums[i]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}