class Solution {
    public int longestConsecutive(int[] nums) {
       
       Arrays.sort(nums);

       HashSet<Integer> set = new HashSet<>();

       for(int x : nums)
       {
            set.add(x);
       }


       int lenMax = 0;
       int len = 0;
       for(int num : set)
       {

        if(!set.contains(num - 1))
        {
            int curr = num;
            len = 1;
            while(set.contains(curr + 1))
            {
                len++;
                curr++;
            }

        }
        if(len > lenMax)
        {
            lenMax = len;
        }
       }

       return lenMax;
        
    }
}
