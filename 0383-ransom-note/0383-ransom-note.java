class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count =new int[26];
        for( char c1:magazine.toCharArray()){
             count[c1-'a']++;    /////correct position 
        }
        for( char c2:ransomNote.toCharArray()){             
            if(count[c2-'a']==0){
                return false;
                
            }
            count[c2-'a']--;
            
        }
        return true;
    }
}

