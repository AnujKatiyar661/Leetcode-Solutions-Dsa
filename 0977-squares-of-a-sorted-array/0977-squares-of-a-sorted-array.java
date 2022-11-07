class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans=new int[nums.length];
        // int i=0;
        // int j=nums.length-1;
        // for(int k=nums.length-1;k>0;k--){
        //     int start=nums[i]*nums[i];
        //     int end=nums[j]*nums[j];
        //     if(start>end){
        //         ans[i]=start;
        //         i++;
        //     }else{
        //         ans[i]=end;
        //         j--;
        //     }
        // }
        // return ans;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}