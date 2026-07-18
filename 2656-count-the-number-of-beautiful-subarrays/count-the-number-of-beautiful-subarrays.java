class Solution {
    public long beautifulSubarrays(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> mpp=new HashMap<>();
        long cnt=0;
        int xr=0;

        mpp.put(0,1);
        for(int i=0;i<n;i++){
            xr=xr^nums[i];
            cnt+=mpp.getOrDefault(xr,0);
            mpp.put(xr,mpp.getOrDefault(xr,0)+1);
        }
        return cnt;
    }
}