class Solution {
    public int[] twoSum(int[] nums, int target) {
        int r[] = new int[2];
        HashMap<Integer,Integer> hmap = new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++){
            int req = target-nums[i];
            if(hmap.containsKey(req)){
               r[0] =hmap.get(req);
               r[1]=i;
               break;
            }
            else{
                hmap.put(nums[i],i);
            }

        }
        return r;
        
        
    
}}
