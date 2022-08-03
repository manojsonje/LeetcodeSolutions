class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> aMap = new HashMap<Integer,Integer>();
        ArrayList<Integer> resList = new ArrayList<Integer>();
        int[] a;
        int[] b;
        if(nums1.length>nums2.length){
            a = nums1;
            b = nums2;
        }else{
            a = nums2;
            b = nums1;
        }
        for(int num : a){
            aMap.put(num,aMap.getOrDefault(num,0)+1);
        }
        for(int num: b){
            if(aMap.containsKey(num) && aMap.get(num)>0){
                resList.add(num);
                aMap.put(num,aMap.get(num)-1);
            }
        }
        return resList.stream().mapToInt(i -> i).toArray();
    }
}