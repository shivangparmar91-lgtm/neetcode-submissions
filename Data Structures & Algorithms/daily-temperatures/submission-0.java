class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int ans[] = new int[temperatures.length];

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0;i<temperatures.length;i++)
        {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()])
            {
                int previdx = stack.pop();

                ans[previdx] = i - previdx;
            }

            stack.push(i);
        }

        return ans;
    }
}
