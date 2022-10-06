class Solution {
    public void reverseString(char[] s) 
    {
        int len = s.length;
        char a ; 
        for (int i = 0 ; i < len / 2 ; i++)
        {
            a = s[len-1-i];
            s[len-1-i]= s[i];
            s[i]= a;
        }
        
    }
}
