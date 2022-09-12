class Solution {
     public int eraseOverlapIntervals(int[][] intervalsArr) {
        if (intervalsArr.length == 0)  return 0;
        Interval[] intervals = new Interval[intervalsArr.length];
	       
	        for(int row = 0; row < intervalsArr.length; row++){
	               intervals[row] = new Interval(intervalsArr[row][0],intervalsArr[row][1]);
	        }
        Arrays.sort(intervals, new myComparator());
        int end = intervals[0].end;
        int count = 1;        

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
                count++;
            }
        }
        return intervals.length - count;
    }
    
    class Interval{
    int start;
    int end;
    Interval(int start,int end){
        this.start = start;
        this.end = end;
    }
}
    class myComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.end - b.end;
        }
    }
}
