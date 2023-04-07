class Solution {
    public int findDuplicate(int[] nums) {
        
        // Using HashSet To Store Unique Values
        HashSet<Integer> set = new HashSet<>();
        
        //Traversing Through The Array
        for(int num : nums){
            
            // Whenever set.add() returnns false, Return The Number As Its A Duplicate
            if(!set.add(num)){
                //Returning Duplicate
                return num;
            }
        }
        
        // Default Return In Case No Duplicate Is Found
        return -1;
    }
}       
                   
                   
                   

                   
                   
                   
                   
                   
 