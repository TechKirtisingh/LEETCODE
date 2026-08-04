// use of both TRANSPOSE AND REVERSE 

class Solution{
    public void rotate(int[][] matrix)
    {
        int n= matrix.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1 ; j<n ;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        // Reverse

        for(int i=0 ; i<n ; i++)
        {
            int left =0;
            int right = n-1;

            while(left<right)
            {
                // Temporary variable mein left wali value store karte hain.              
                int temp = matrix[i][left];
                //Right wali value ko left mein rakh do.
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}










// another method

// class Solution {
//     public void rotate(int[][] matrix) {

//         int n = matrix.length;

//         int[][] ans = new int[n][n];

//         for (int i = 0; i < n; i++) {

//             for (int j = 0; j < n; j++) {

//                 //Original matrix ka element uthao aur uski rotated position par rakh do.

//                 ans[j][n - 1 - i] = matrix[i][j];
//             }
//         }

//         for (int i = 0; i < n; i++) {

//             for (int j = 0; j < n; j++) {

//                 matrix[i][j] = ans[i][j];
//             }
//         }
//     }
// }
