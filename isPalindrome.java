class Solution {
    public boolean isPalindrome(int x) 
    {
        int rev = 0;
        int s = x;
    while (s!=0)
    {  int a = s%10;
       s = s/10;
       rev = rev*10 + a;
    }
    if (rev==x && x>=0)
    {
        return true;
    }
    return false;
    }
}
