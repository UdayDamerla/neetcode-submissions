class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> rs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (rs.containsKey(diff)) {
                return new int[] {rs.get(diff), i};
            }
            rs.put(nums[i], i);
        }
        return new int[] {};
    }
}
