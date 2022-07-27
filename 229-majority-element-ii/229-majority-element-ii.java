class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1,num2 = -1;
        int count1 =0,count2 =0;
        int n = nums.length;
        List<Integer> resList = new ArrayList<Integer>();
        for(int num : nums){
            if(num1 == num){
                count1 += 1;
            }else if(num2 == num){
                count2 += 1; 
            }else if(count1 == 0){
                num1 = num;
                count1 = 1;
            }else if(count2 == 0){
                num2 = num;
                count2 = 1;
            } else{
                count1 -= 1;
                count2 -= 1;
            }
        }
        count1 = 0;
        count2 = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] == num1)
        count1++;
      else if (nums[i] == num2)
        count2++;
    }
        if(count1 > n/3){
            resList.add(num1);
        }
        if(count2 > n/3){
            resList.add(num2);
        }
        return resList;
    }
}