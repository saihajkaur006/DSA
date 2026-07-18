class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        int subarrayCnt=0 , currSum=0;

        prefixSum.put(0,1);
        for(int i=0;i<n;i++){
            currSum+=nums[i];
            int rem=currSum-k;
            subarrayCnt+=prefixSum.getOrDefault(rem,0);
            prefixSum.put(currSum,prefixSum.getOrDefault(currSum,0)+1);
        }
        return subarrayCnt;
    }
}