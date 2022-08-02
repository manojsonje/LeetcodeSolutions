class Solution {
    public void moveZeroes(int[] nums) {
        int i1 = 0;
        int i2 = 0;
        int n = nums.length;
        while(i1<n && i2<n){
            if(nums[i1] == 0 && nums[i2]!=0){
                swap(nums,i1,i2);
                i1++;
                i2++;
            }else if(nums[i1] != 0){
                i1++;
                i2++;
            }else{
               i2++;
            }
        }
    }
    
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}