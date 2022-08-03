class Solution {
    int[] nums;
    int[] shuffle;
    public Solution(int[] nums) {
        this.nums = nums;
                       
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        this.shuffle = nums.clone();
        
        Random rand = new Random(); //instance of random class
        int n = shuffle.length;
        for(int i=n-1;i>=0;i--){
            int m = rand.nextInt(i+1);
            int temp = shuffle[m];
            shuffle[m] = shuffle[i];
            shuffle[i] = temp;
        }
        return shuffle;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */