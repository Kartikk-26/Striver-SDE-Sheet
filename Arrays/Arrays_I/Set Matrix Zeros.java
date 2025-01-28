//Question Number : 73.
//Question Name :  Set Matrix Zeroes


class Solution {
    public void setZeroes(int[][] matrix) {
        //Declatration
        int rows = matrix.length;
        int cols = matrix[0].length;
        int srows[] = new int[rows];
        int scols[] = new int[cols];
        int i,j;

        //A loop for making the value in special box 1 if element is 0
        for(i=0; i<rows; i++){
            for(j=0; j<cols; j++){
                //making special rows and column value as 1 if element is 0
                if(matrix[i][j]==0){
                    srows[i]=1;
                    scols[j]=1;
                }
            }
        }

        //No reiterate to check if special box value is 1 than replace the elementof that row and column of matrix as 0

        for(i=0; i<rows; i++){
            for(j=0; j<cols; j++){
                //if special row and column has the value as 1 so we will make the element of that row and cols as 0
                if(srows[i] ==1 || scols[j]==1 ){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}