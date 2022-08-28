class Solution {
    public int findDuplicate(int[] nums) {
        
        int l = nums.length ;
        
        HashMap <Integer,Integer> hm = new HashMap();
        
        
        for(int i = 0 ; i < l ; i++)
        {
            if(!hm.containsKey(nums[i]))
               hm.put(nums[i],1);
            else
                return nums[i];
        }
     
        
        return 0 ;
    }
}