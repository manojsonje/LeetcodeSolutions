class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] match_matrix = new boolean[s.length()+1][p.length()+1];
        match_matrix[s.length()][p.length()] = true;
        
        for(int pIndex=p.length()-1; pIndex>=0; pIndex--){
            if(p.charAt(pIndex) != '*'){
                break;
            }
            match_matrix[s.length()][pIndex] = true;
        }
        
        for(int sIndex = s.length()-1; sIndex >= 0; sIndex--){
            for(int pIndex=p.length()-1; pIndex>=0; pIndex-- ){
                if(p.charAt(pIndex) == s.charAt(sIndex) || p.charAt(pIndex)=='?'){
                   match_matrix[sIndex][pIndex] =  match_matrix[sIndex+1][pIndex+1];
                }else if(p.charAt(pIndex) == '*'){
                    match_matrix[sIndex][pIndex] = (match_matrix[sIndex+1][pIndex] || match_matrix[sIndex][pIndex+1] );
                }else{
                   match_matrix[sIndex][pIndex] = false;
                }
                 
            }
        }
        return match_matrix[0][0];
    }
}