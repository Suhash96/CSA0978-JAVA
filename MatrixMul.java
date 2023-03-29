ja class MatrixMultiplication {
   public static void main(String[] args) {
      int[][] mat1 = {{1, 2}, {5, 3}}; // input matrix 1
      int[][] mat2 = {{2, 3}, {4, 1}}; // input matrix 2
      
      int row1 = mat1.length;
      int col1 = mat1[0].length;
      int col2 = mat2[0].length;
      
      int[][] matSum = new int[row1][col2];
      
      for(int i=0; i<row1; i++) {
         for(int j=0; j<col2; j++) {
            for(int k=0; k<col1; k++) {
               matSum[i][j] += mat1[i][k] * mat2[k][j];
            }
         }
      }
      
      // Printing the resultant matrix
      System.out.println("Matrix multiplication result:");
      for(int i=0; i<row1; i++) {
         for(int j=0; j<col2; j++) {
            System.out.print(matSum[i][j] + " ");
         }
         System.out.println();
      }
   }
}