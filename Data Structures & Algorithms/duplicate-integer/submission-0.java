class Solution {
    public boolean hasDuplicate(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                    break;
                }}
                if(c>0){
                    break;
                }
            
        }
        if(c>0)
        return true;
        else
        return false;
    }
}