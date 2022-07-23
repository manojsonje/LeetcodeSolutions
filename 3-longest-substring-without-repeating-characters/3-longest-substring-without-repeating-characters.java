class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,maxLen=0;
        int n = s.length();
        char[] charArr = s.toCharArray();
        HashSet<Character> hSet = new HashSet<>();
        while(i<n && j<n){
            if(hSet.contains(charArr[i])){
                hSet.remove(charArr[j]);
                j++;
                
            }else{
                hSet.add(charArr[i]);
                i++;
                maxLen = Math.max(maxLen,hSet.size());
            }
        }
        return maxLen;
    }
}