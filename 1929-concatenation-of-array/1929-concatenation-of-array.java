class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] c = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            c[i] = nums[i];
            c[i + nums.length] = nums[i];
        }

        return c;
    }
}
