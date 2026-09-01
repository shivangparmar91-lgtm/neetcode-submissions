class Solution {
    public int characterReplacement(String s, int k) {
        int maxL = Integer.MIN_VALUE;

        int maxF = Integer.MIN_VALUE;

        int count[] = new int[26];

        int l = 0;
        
        for(int r = 0;r<s.length();r++)
        {
            count[s.charAt(r) - 'A']++;

            maxF = Math.max(maxF,count[s.charAt(r) - 'A']);

            while((r - l + 1) - maxF > k)
            {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            maxL = Math.max(maxL,r - l + 1);
        }

        return maxL;
    }
}
