package leetcode.editor.en;

//Given an integer array nums, move all 0's to the end of it while maintaining 
//the relative order of the non-zero elements. 
//
// Note that you must do this in-place without making a copy of the array. 
//
// 
// Example 1: 
// Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
// 
// Example 2: 
// Input: nums = [0]
//Output: [0]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you minimize the total number of operations done?
//
// Related Topics Array Two Pointers 👍 10731 👎 261

public class MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new MoveZeroes().new Solution();

    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public void moveZeroes(int[] nums) {
            int k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[k++] = nums[i];
                }
            }

            while (k < nums.length) {
                nums[k++] = 0;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}