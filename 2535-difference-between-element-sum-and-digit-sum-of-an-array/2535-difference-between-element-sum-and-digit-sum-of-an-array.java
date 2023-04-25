class Solution {
    public int differenceOfSum(int[] nums) {
        int eSum =0;
        int dSum =0;
        for(int i=0;i<nums.length;i++){

           eSum+=nums[i];
        
        while(nums[i] > 9){

        dSum+=nums[i]%10;
            nums[i]/=10;
            
        }
        if(nums[i]<=9){
         dSum+=nums[i];
        
        }
        }
        
       return Math.abs(eSum-dSum); 
    }
}