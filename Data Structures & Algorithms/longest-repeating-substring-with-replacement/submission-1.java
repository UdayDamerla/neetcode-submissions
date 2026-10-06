class Solution {
    public int characterReplacement(String s, int k) {
        int stringSize = s.length();
        int[] charCounts = new int[26];
        int longest = 0;
        int maxCount = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd<stringSize;windowEnd++) {
            char current = s.charAt(windowEnd);
            charCounts[current - 'A']++;
            maxCount = Math.max(maxCount, charCounts[current - 'A']);
            while(windowEnd - windowStart - maxCount + 1 > k) {
                charCounts[s.charAt(windowStart) - 'A']--;
                windowStart++;
            }
            longest = Math.max(longest, windowEnd - windowStart + 1);            
        }
        return longest;
    }
}