class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> prefixSumMap=new HashMap<>();
        int currnt=0,subarrCnt=0;

        prefixSumMap.put(0,1);
        for(int i=0;i<n;i++){
            currnt+=nums[i];
            int sumToRemove=currnt-k;
            subarrCnt+=prefixSumMap.getOrDefault(sumToRemove,0);
            prefixSumMap.put(currnt,prefixSumMap.getOrDefault(currnt,0)+1);
        }
        return subarrCnt;
        
    }
}