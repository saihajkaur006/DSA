class Solution {
    public int findMaxLength(int[] nums) {
        //0->-1 and 1->+1 calc longest sub with sum 0 --> prefixsum+hashMap
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) sum++;
            else sum--;

            if(map.containsKey(sum)){
                int len=i-map.get(sum);
                max=Math.max(max,len);
            }
            else map.put(sum,i);
        }
        return max;
    }
}