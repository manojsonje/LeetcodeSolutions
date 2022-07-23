class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hMap = new HashMap<Integer,Integer>();
        int[] resArr =new int[2];
        for(int i=0;i<nums.length;i++){
            Integer nInd = hMap.get(target-nums[i]);
            if(nInd != null){
                resArr[0] = i;
                resArr[1] = nInd;
                return resArr;
            }else{
                hMap.put(nums[i],i);
            }
        }
        return resArr;
    }
}