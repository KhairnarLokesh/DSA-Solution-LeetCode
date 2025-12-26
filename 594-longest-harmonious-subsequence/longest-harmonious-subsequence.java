class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);

        int left=0;

        int maxlen=0;

        for(int right=0;right<nums.length;right++){
            while(nums[right]-nums[left]>1){
              left++;

            }

            if(nums[right]-nums[left]==1){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        return maxlen;
    }
}