
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbersList = new ArrayList<>();
            
        for(int i = 0;i<matrix.length;i++){
            int min = matrix[i][0];
            int column = 0;
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    column = j;
                }
            }
            int max = matrix[0][column];
            for(int k = 0;k<matrix.length;k++){
                if(matrix[k][column] > max){
                    max = matrix[k][column];
                }
            }
            if(min == max){
                luckyNumbersList.add(min);
            }
        }
        return luckyNumbersList;
    }
}