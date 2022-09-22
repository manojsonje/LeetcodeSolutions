class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int ig = 0, is = 0;
        int contentCount = 0;
        
        while(ig < g.length && is < s.length){
            if(s[is] >= g[ig]){
                contentCount++;
                ig++;
            }
            is++;
        }
        return contentCount;
    }
}