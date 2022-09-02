class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)
            return false;
        int A = x ;
        int res =0  ;
        
        while(x!=0)
        {
            int r = x%10;
            res = res*10+r;
            x=x/10;
            
            
        }
        
        if (res==A)
            return true ;
        else
            return false ;
        
        
    }
}