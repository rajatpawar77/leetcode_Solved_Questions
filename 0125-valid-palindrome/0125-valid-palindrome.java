class Solution {
    public boolean isPalindrome(String s) {
        
        String s1 = s.toLowerCase();
        s1=s1.replace(" ","");
        s1=s1.replaceAll("[^a-zA-Z0-9]","");
        
        
    String s2 ="";
        
        for(int i = s1.length()-1 ; i>=0;i--)
        {
            
            s2=s2+s1.charAt(i);
        }
       // System.out.print(s2);
        if(s2.equals(s1))
        {
        return true ;
        }
        else {
            return false ;
        }
        
    }
}