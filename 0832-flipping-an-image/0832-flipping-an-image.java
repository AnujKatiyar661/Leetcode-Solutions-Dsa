class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int i=0; i < A.length;i++){
            int start =0;
            int end= A[i].length-1;
            
            
            while(start <=end){
                if(A[i][start]==A[i][end]){
                    A[i][start]=1-A[i][start];
                    A[i][end]=A[i][start];
                }
                start++;
                end--;

            }
        }
        return A;
    }
}