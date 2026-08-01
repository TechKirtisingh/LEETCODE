class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;  // total no. of row 
        int n = matrix[0].length; // total no. of column

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {

// Binary Search
//Imagine Matrix as 1D Array : Instead of actually creating a new array, we pretend the matrix is like this

            int mid = left + (right - left) / 2;

// // Convert 1D index to 2D index

            int row = mid / n;
            int col = mid % n;

            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}





// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {

//         int row = 0;
//         int col = matrix[0].length -1 ; // last column

//         while(row<matrix.length && col>=0) // row choti ho matrix ke length se means last row tk 
//         {
//             if(matrix[row][col] == target)
//             {
//                 return true;
//             }
//             else if(matrix[row][col] > target)
//             {
//                 col--;
//             }
//             else
//             {
//                 row++;
//             }
//         }

//         return false;
//     }
// }







// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) 
//     {
//        for(int i=0;i<matrix.length;i++)
//        {
//             for(int j=0; j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j] == target)
//                 {
//                     return true;
//                 }
//             }
//        }

//        return false;

//     }
// }