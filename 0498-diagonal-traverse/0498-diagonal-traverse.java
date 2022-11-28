class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        
        int m = matrix.length,n=matrix[0].length;
        int[]arr =new int[m*n];
        int i=0;
        int row =0,col=0;
        boolean up =true;
        while(row<m &&col<n){
            //if digonal is going up 
            if(up){
                while(row>0 && col <n-1){
                    arr[i++]=matrix[row][col];
                    row--;
                    col++;
                    
                }
                 arr[i++]=matrix[row][col];
                if(col==n-1){
                    row++;
                    
                }
                else{
                    col++;
                }
                
            }
            else{
               while(col>0 &&row<m-1){
                   arr[i++]=matrix[row][col];
                   row++;
                   col--;
                   
               }
                arr[i++]=matrix[row][col];
                if(row==m-1){
                    col++;
                }
                else{
                    row++;
                }
                
}
            up=!up;
        }
        return arr;
    }
}