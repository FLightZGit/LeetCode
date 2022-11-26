package leetcode.editor.en;

//Given an m x n matrix, return all elements of the matrix in spiral order. 
//
// 
// Example 1: 
// 
// 
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
// 
//
// Example 2: 
// 
// 
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 10 
// -100 <= matrix[i][j] <= 100 
// 
//
// Related Topics Array Matrix Simulation 👍 8722 👎 910

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        Solution solution = new SpiralMatrix().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> res = new ArrayList<>();
            int left = 0, right = matrix[0].length-1;
            int top = 0, bottom = matrix.length-1;

            while (res.size() < matrix.length * matrix[0].length) {
                if (top <= bottom) {
                    for (int i = left; i <= right; i++) {
                        res.add(matrix[top][i]);
                    }
                    top++;
                }
                if (left <= right) {
                    for (int i = top; i <= bottom; i++) {
                        res.add(matrix[i][right]);
                    }
                    right--;
                }
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        res.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        res.add(matrix[i][left]);
                    }
                    left++;
                }
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}