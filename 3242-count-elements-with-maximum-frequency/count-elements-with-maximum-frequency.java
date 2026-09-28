class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp= new HashMap<>();
        int maxFreq=0;
        int count=0;

        for(int i=0;i<n;i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0)+1);
        }
        for(int it:mpp.values()){
            maxFreq=Math.max(maxFreq,it);
        }
        for(int cnt:mpp.values()){
            if(cnt==maxFreq){
                count++;
            }
        }
        return count*maxFreq;
        
    }
}