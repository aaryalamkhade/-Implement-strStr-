class Solution {
    public int strStr(String haystack, String needle) 
    {
        String s="";
         int flag=-1;   
         if(haystack.length()==0 && needle.length()>0)
            return -1;
         if(haystack.length()==0 || needle.length()==0)
            return 0;
        
            for(int i=0;i<haystack.length()-needle.length()+1;i++)
            {
                s=haystack.substring(i,needle.length()+i);
                if(s.equals(needle))
                {
                    flag=i;
                    break;
                }
            }
       
            return flag;
         
    }
}
