class Solution {
    public int[] findErrorNums(int[] nums) {
        int rep = 0, ans=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=nums.length;++i){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    rep=i;
                }
            }
            else{
                ans=i;
            }
        }
        return new int[]{rep,ans};
    }
}