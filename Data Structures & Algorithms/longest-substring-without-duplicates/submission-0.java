class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0;
        int maxL = Integer.MIN_VALUE;

        if(s.length() == 0)
        {
            return 0;
        }

        for(int r = 0;r<s.length();r++)
        {
            if(set.contains(s.charAt(r)))
            {
                while(set.contains(s.charAt(r)))
                {
                    set.remove(s.charAt(l));
                    
                        l++;
                
                }
            }

            set.add(s.charAt(r));

            maxL = Math.max(maxL,r - l + 1);
        }

        return maxL;
    }
}
