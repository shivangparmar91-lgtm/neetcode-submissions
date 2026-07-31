class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0;i<nums.length;i++)
        {

        int j = i + 1;
        int k = nums.length - 1;
        while(j < k)
        {
            
            int target = -(nums[i]); 
                       
            if(target == (nums[j] + nums[k]))
            {
                List<Integer> l = new ArrayList<>();
                l.add(nums[i]);
                l.add(nums[j]);
                l.add(nums[k]);

                if(!list.contains(l))
                {
                    list.add(l);
                }
                j++;
                k--;
            }

            else if((nums[j] + nums[k]) < target)
            {
                j++;
            }
            else 
            {
                k--;
            }
        }

    
        }
        return list;
    }
}
