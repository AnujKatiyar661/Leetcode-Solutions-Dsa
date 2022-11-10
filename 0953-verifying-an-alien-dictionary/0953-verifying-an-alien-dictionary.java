class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int eng[] =new int[26];
        for(int i=0;i<order.length();i++){
            eng[order.charAt(i)- 'a']=i;
            

        }
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                int min = Math.min(words[i].length(),words[j].length());
                for(int k=0;k<min;k++){
                    char ich =words[i].charAt(k);
                    char jch =words[j].charAt(k);
                    
                    if(eng[ich -'a']<eng[jch -'a']){
                        break;
                    }
                    else if(eng[ich-'a']>eng[jch -'a']){
                        return false;
                        
                    }
                    else if(k==min-1 && words[i].length()>words[j].length()){
                        return false;
                   
                    }
                }
            
                }
        
            }
             return true;
        }
       }
 




