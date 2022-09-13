class Solution {
    public int jump(int[] nums) {
        int jumpCount = 0, max = 0, nextStep=0;
        for(int index = 0; index < nums.length-1; index++){
            max = Math.max(max, index + nums[index]);
            if(index == nextStep){
                jumpCount++;
                nextStep = max;
            }    
        }
        return jumpCount;
    }
}