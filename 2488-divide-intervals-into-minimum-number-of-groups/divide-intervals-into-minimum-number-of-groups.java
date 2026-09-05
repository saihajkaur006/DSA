class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;

        int[] start = new int[n];
        int[] end=new int[n];

        for(int i=0;i<n;i++){
            start[i]=intervals[i][0];
            end[i]=intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);
        int ans=1;
        int cnt=1;
        int i=1,j=0;

        while(i<n&& j<n){
            if(start[i]<=end[j]){
                cnt++;
                i++;
            }else{
                cnt--;
                j++;
            }
            ans=Math.max(ans,cnt);
        }
        return ans;
    }
}