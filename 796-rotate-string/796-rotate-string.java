class Solution {
    public boolean rotateString(String s, String goal) {
        
       
        String s2,s3 ;
       
        
        
        for(int i = 1 ; i<s.length();i++)
        {
            
            s2 = s.substring(i);
            s3=s2+s.substring(0,i);
          
            if(goal.equals(s3))
            {
              return true ;
            }
            
            
        }
        
       
        
  return false ;
        
    }
}