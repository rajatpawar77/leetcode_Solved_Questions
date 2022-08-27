class Solution {
    public boolean rotateString(String s, String goal) {
        
        String s1 ="";
        String s2,s3 ;
        int count = 0 ;
        
        
        for(int i = 1 ; i<s.length();i++)
        {
            
            s2 = s.substring(i);
            s3=s2+s.substring(0,i);
          
            if(goal.equals(s3))
            {
              count++;
            }
            
            
        }
        
        if(count==0)
        {
            return false ;
        }
        
  return true ;
        
    }
}