class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int l = 0;
        int h = (m*n)-1;
        if(matrix == null || matrix.length == 0){
            return false;
        }
        while(l<=h){
            int mid  = l+((h-l)/2);
            if(matrix[mid/n][mid%n] == target){
                return true;
            }
            
            if(matrix[mid/n][mid%n] < target){
                l = mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}