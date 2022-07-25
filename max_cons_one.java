class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        
        int n= nums.length;
        
        int i=0;
        
        while(i<n)
        {
            if(nums[i]==1)
            {
                int c = 0;
                while(i<n && nums[i]==1)
                {
                    i++;
                    c++;
                }
                
                ans = Math.max(ans,c);
            }
            else
            {
                i++;
            }
        }
        
        return ans;
    }
}
