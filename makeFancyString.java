class Solution {
    public String makeFancyString(String s) 
    {
        StringBuilder res = new StringBuilder ();
        int count =1;
        int len = s.length();
        for (int i=0; i < len-1; i++ )
        {
            if (s.charAt(i)==s.charAt(i+1))
            {
                count++;
            }
            else
            {
                count = 1;
            }
        if (count < 3)
        {
            res = res.append(s.charAt(i));
        }
        }
        res = res.append(s.charAt(len-1));
        return res.toString();
        
    }
}
