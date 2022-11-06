class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         int i=0;
        int j=0;
        int k=0;
        ArrayList<Integer> list =new ArrayList<>();
        
        while(i<nums1.length && j<nums2.length){
            
            if(i>0 && nums1[i]==nums1[i-1])
            {
                i++;
                continue;
            }
            if(nums1[i]<nums2[j]){
              i++;  
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            
            else{
                list.add(nums1[i++]);
                j++;
                }
            
        }
        
        int [] arr=new int[list.size()];
        
        for(k=0;k<arr.length;k++)
        {
            arr[k]=list.get(k);
        }
       
        return arr;
     }
}