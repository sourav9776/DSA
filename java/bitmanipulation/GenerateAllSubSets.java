public class GenerateAllSubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int subset = 0; subset < (1 << nums.length); subset++) {
            List<Integer> list = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (((subset >> index) & 1) == 1) {
					list.add(nums[index]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}

/*
https://leetcode.com/problems/subsets/description/
Question:
Given an integer array nums of unique elements, return all possible  subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.
*/
