class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] m = new int[128];
        int l = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            l = Math.max(m[s.charAt(r)], l);
            max = Math.max(max, r - l + 1);
            m[s.charAt(r)] = r + 1;
        }
        return max;
    }
}