class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (int[] a, int[] b)->Integer.compare(a[1], b[1]));
        
        int end = points[0][1], arrowShots = 1;
        
        for(int i=1; i<n; i++){
            if(end >= points[i][0]){
                continue;
            }else{
                arrowShots++;
                end = points[i][1];
            }
        }
        
        return arrowShots;
    
    }
}