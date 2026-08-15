class Solution {
    public int evalRPN(String[] tokens) {
        
        Deque<String> stack = new ArrayDeque<>();

        for(String word : tokens)
        {
            char ch = word.charAt(0);

            if(!word.equals("+") && !word.equals("-") && !word.equals("*") && !word.equals("/"))
            {
                stack.push(word);
            }
            else
            {
                if(ch == '+')
                {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());

                    int ans = b + a;
                    String a1 = String.valueOf(ans);
                    stack.push(a1); 
                }
                else if(ch == '-')
                {
                    int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());

                    int ans = b - a;
                    String a1 = String.valueOf(ans);
                    stack.push(a1); 
                }
                else if(ch == '*')
                {
                   int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());

                    int ans = b * a;
                    String a1 = String.valueOf(ans);
                    stack.push(a1); 
                }
                else 
                {
                   int a = Integer.parseInt(stack.pop());
                    int b = Integer.parseInt(stack.pop());

                    int ans = b / a;
                    String a1 = String.valueOf(ans);
                    stack.push(a1); 
                }
            }
        }

        int fi = Integer.parseInt(stack.pop());
        return fi;
        
    }
}
