class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, maxLength = 0;
        Set<Character> set = new HashSet<>();

        while (j < s.length()) { 

            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j)); 
            maxLength = (int) Math.max(maxLength, j - i + 1); 
            j++;
        }
        return maxLength;
    }
}
