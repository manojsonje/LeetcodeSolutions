class Solution {
    public int singleNumber(int[] nums) {
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            res = res^nums[i];
        }
        return res;
    }
    
//     public int singleNumber(int[] nums) {
//         Map<Integer,Integer> numCountMap = new HashMap<Integer, Integer>();
//         for(int i=0;i<nums.length;i++){
//             if(numCountMap.containsKey(nums[i]))
//                 numCountMap.put(nums[i],numCountMap.get(nums[i])+1);
//             else
//                 numCountMap.put(nums[i],1);
//         }
        
//         for (Map.Entry<Integer, Integer> mEntry : numCountMap.entrySet()) {
           
//             if(mEntry.getValue()==1){ 
//                 return mEntry.getKey();
//             }
//         }
//         return -1;
//     }
}