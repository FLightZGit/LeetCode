package leetcode.editor.en;

import java.util.LinkedList;
import java.util.List;

/**
 * Given an array of distinct integers candidates and a target integer target,
 * return a list of all unique combinations of candidates where the chosen numbers sum
 * to target. You may return the combinations in any order.
 * <p>
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen numbers
 * is different.
 * <p>
 * The test cases are generated such that the number of unique combinations that
 * sum up to target is less than 150 combinations for the given input.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: candidates = [2,3,6,7], target = 7
 * Output: [[2,2,3],[7]]
 * Explanation:
 * 2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple
 * times.
 * 7 is a candidate, and 7 = 7.
 * These are the only two combinations.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: candidates = [2,3,5], target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * <p>
 * <p>
 * Example 3:
 * <p>
 * <p>
 * Input: candidates = [2], target = 1
 * Output: []
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 1 <= candidates.length <= 30
 * 2 <= candidates[i] <= 40
 * All elements of candidates are distinct.
 * 1 <= target <= 40
 * <p>
 * <p>
 * Related Topics Array Backtracking 👍 14235 👎 286
 */
public class CombinationSum {
    public static void main(String[] args) {
        Solution solution = new CombinationSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> track = new LinkedList<>();
        int trackSum = 0;

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            if (candidates.length == 0) {
                return res;
            }
            backtrack(candidates, 0, target);
            return res;
        }

        void backtrack(int[] nums, int start, int target) {
            if (trackSum == target) {
                res.add(new LinkedList<>(track));
            }
            if (trackSum > target) {
                return;
            }
            for (int i = start; i < nums.length; i++) {
                trackSum += nums[i];
                track.add(nums[i]);
                backtrack(nums, i, target);
                trackSum -= nums[i];
                track.removeLast();
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 