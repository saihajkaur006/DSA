class Solution {
    private boolean canWePlace(int[] nums,int dist,int magnets){
        int n=nums.length;
        int last=nums[0];
        int cntmag=1;

        for(int i=0;i<n;i++){
            if(nums[i]-last>=dist){
                cntmag++;
                last=nums[i];
            }
            if(cntmag>=magnets){
                return true;
            }

        }
        return false;

    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int low=1,high=position[n-1]-position[0];

        while(low<=high){
            int mid=(low+high)/2;
            if(canWePlace(position,mid,m)==true){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high;
        
    }
}