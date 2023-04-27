class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int count=0;
        for(int i=0;i<sentences.length;i++){
             count=0;
            int length=sentences[i].length();
            for(int j=0;j<length;j++){
                String a=sentences[i];
                if(a.charAt(j)==32){
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
        }
        return max+1;
        
    }
}



// class Solution {
//     public int mostWordsFound(String[] sentences) {
//         int max =0;
//         int count =0;
//         for(int i =0;i<sentences.length;i++)
            
//         {
//               // int count =0;
//             int length=sentences[i].length();
//             for(int j=0;j<length;j++)
//             {
//              String a =sentences[i];
             
//                if(a.charAt(j)==32){
//                 count++;
//             }   
//          }
        
//         if(max<count){
//             max =count;
            
//         }  
//     }
//         return max+1;
        
//     }
// }

// class Solution {
//     public int mostWordsFound(String[] sentences) {
//         int max=0;
//         int count=0;
//         for(int i=0;i<sentences.length;i++){
//              count=0;
//             int length=sentences[i].length();
//             for(int j=0;j<length;j++){
//                 String a=sentences[i];
//                 if(a.charAt(j)==32){
//                     count++;
//                 }
//             }
//             if(max<count){
//                 max=count;
//             }
//         }
//         return max+1;
        
//     }
// }