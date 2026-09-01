class Solution {
    public int characterReplacement(String s, int k) {

        int maxL = Integer.MIN_VALUE; // Stores the maximum valid window length found
        int maxF = Integer.MIN_VALUE; // Stores the highest frequency of any character in the window

        int count[] = new int[26]; // Stores frequency of each uppercase character A-Z
        int l = 0; // Left pointer of the sliding window

        for (int r = 0; r < s.length(); r++) {

            count[s.charAt(r) - 'A']++; // Add current right character to the window

            maxF = Math.max(maxF, count[s.charAt(r) - 'A']); // Update maximum character frequency

            // If replacements needed = window size - max frequency exceeds k, shrink the window
            while ((r - l + 1) - maxF > k) {
                count[s.charAt(l) - 'A']--; // Remove the left character from the window
                l++; // Move the left pointer to shrink the window
            }

            maxL = Math.max(maxL, r - l + 1); // Update the maximum valid window length
        }

        return maxL; // Return the longest valid substring length
    }
}