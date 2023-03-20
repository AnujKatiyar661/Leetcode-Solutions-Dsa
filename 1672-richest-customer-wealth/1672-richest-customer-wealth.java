class Solution {
    public int maximumWealth(int[][] accounts) { /// 2d array problem 
       int   maxWealth =0;
        for(int [] account:accounts){ 
            int sum =0;
            for(int amt:account){
            sum =sum +amt;
            }
             if(maxWealth<sum){

             maxWealth =sum;
             }
       
        }
        return maxWealth;
    }
}