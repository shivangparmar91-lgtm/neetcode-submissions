class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();

        char ch[] = s.toCharArray();

        for(char c : ch)
        {
            if(c == '(' || c == '[' || c=='{')
            {
                stack.push(c);
            }
            else 
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if(c == ')')
                {
                    if(stack.peek() != '(')
                    {
                        return false;
                    }
                    stack.pop();
                }
                if(c == ']')
                {
                    if(stack.peek() != '[')
                    {
                        return false;
                    }
                    stack.pop();
                }
                if(c == '}')
                {
                    if(stack.peek() != '{')
                    {
                        return false;
                    }
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
