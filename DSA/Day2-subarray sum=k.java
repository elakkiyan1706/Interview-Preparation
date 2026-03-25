class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int cursum=0;
            for(int j=i;j<nums.length;j++){
                cursum+=nums[j];
                if(cursum==k){
                    count++;
                }
        }
        }
        return count;
    }
}