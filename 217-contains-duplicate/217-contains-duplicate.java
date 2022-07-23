class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!hs.add(nums[i])){
                return true;
            }
        }
        return false;
    }
    
    
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for(int i=1;i<nums.length;i++){
    //         if(nums[i-1]==nums[i]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }

}