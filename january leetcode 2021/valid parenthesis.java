class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(char ch:s.toCharArray())
        {
            if(ch=='(' ||ch=='{' ||ch=='[')
            {
                stack.push(ch);
                continue;
            }
            
            if(stack.isEmpty())
                return false;
            
            char pick;
            
            switch(ch)
            {
                case ')':
                    pick = stack.pop();
                    if(pick=='{' || pick=='[')
                        return false;
                    break;
                case ']':
                    pick = stack.pop();
                    if(pick =='{' || pick=='(')
                        return false;
                    break;
                case '}':
                    pick = stack.pop();
                    if(pick=='[' || pick=='(')
                        return false;
                    break;
                    
            }
            
        }
         return stack.isEmpty();

    }
}
