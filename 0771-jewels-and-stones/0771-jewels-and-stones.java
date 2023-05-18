class Solution {
    public int numJewelsInStones(String jewels, String stones) { 
        char[] temp= stones.toCharArray();
        int n=0;
        for(int i=0;i<temp.length;i++){
            if(jewels.indexOf(temp[i])!=-1){     /// this aproach by without hash map 

                n++;

            }
        }
          return n;
   


        
    }
}