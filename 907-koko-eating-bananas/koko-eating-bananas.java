class Solution {
    private int findMax(int[]piles){
        int maxi=Integer.MIN_VALUE;
        int n=piles.length;

        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    private long calculateH(int[]piles,int h){
        int totalH=0;
        int n=piles.length;

        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)piles[i]/(double)h);
        }
        return totalH;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high=findMax(piles);

        while(low<=high){
            int mid=low+(high-low)/2;

            long totalH=calculateH(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
        
    }
}