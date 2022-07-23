class Solution {
    public static void reverseRow(int[][] matrix,int i){
        int n = matrix[0].length;
        int p1=0,p2=n-1;
        while(p1<p2){
            int temp = matrix[i][p1];
            matrix[i][p1] = matrix[i][p2];
             matrix[i][p2] =  temp;
            p1++;
            p2--;
        } 
    }
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
           for(int j=i+1;j<matrix[0].length;j++){
               int temp = matrix[i][j];
               matrix[i][j]  = matrix[j][i];
               matrix[j][i] = temp;
           }
        }
        
        for(int i=0;i<matrix.length;i++){
                reverseRow(matrix,i);
        }
    }
}