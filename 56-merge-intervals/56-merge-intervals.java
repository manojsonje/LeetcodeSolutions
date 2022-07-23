class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        LinkedList<int[]> resultLinkedList = new LinkedList<>();
        
        for(int[] interval:intervals){
            if(resultLinkedList.isEmpty() || resultLinkedList.getLast()[1]<interval[0]){
                resultLinkedList.add(interval);
            }else{
                resultLinkedList.getLast()[1]=Math.max(interval[1],resultLinkedList.getLast()[1]);
            }
        }
        
        return resultLinkedList.toArray(new int[0][]);
        
    }
}