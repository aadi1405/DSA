import java.util.*;
class Solution
    {
    public boolean isPalindrome(String s) 
    {
     
     
     s = s.replaceAll("\\p{Punct}", "");
     s = s.toLowerCase();
     s = s.replaceAll("\\s+","");
     System.out.println(s);
     int len = s.length();   
     if (s == null)
     {
         return false;
     }

     for (int i = 0 ; i < len/2 ; i++)
     {
         if (s.charAt(i)!=s.charAt(len-i-1))
         {
             return false;
         }
     }  
     return true;
     }
     

    }
    
