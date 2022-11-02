class Solution {
    public boolean isValid(String s)
    {
        boolean flag = true;
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        int len = arr.length;
        if (len%2 != 0)
            {
                return false;
            }
        for (char c: arr)
        {
           
            if (c =='{' | c=='[' | c=='(')
            {
                stack.push(c);

            }
            else if (c == '}' && stack.isEmpty()!=true && stack.peek()=='{' )
            {
                stack.pop();
            }
            else if (c == ')' && stack.isEmpty()!=true && stack.peek()=='(' )
            {
                stack.pop();
            }
            else if (c == ']' && stack.isEmpty()!=true && stack.peek()=='[' )
            {
                stack.pop();
            }
            else
            {
                flag = false;
            }
    


        }
        if (flag == true && stack.isEmpty()==true)
        {
            flag = true;
        }
        else{
            flag = false;
        }

        return flag;
    }

        
}
