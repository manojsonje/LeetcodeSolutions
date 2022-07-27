class Solution {
    public List<String> summaryRanges(int[] nums) {
         int n = nums.length;
    List<String> resList = new ArrayList<String>();
    if(n==1){
        resList.add(nums[0]+"");
    }else{
    for(int i=0;i<n;i++){
        int val = nums[i];
        while(i+1<n && (nums[i+1]-nums[i])==1){
            i++;
        }

        if(val != nums[i]){
            resList.add(val+"->"+nums[i]);
        }else{
            resList.add(nums[i]+"");
        }
    }
    }

    return resList;

    }
}