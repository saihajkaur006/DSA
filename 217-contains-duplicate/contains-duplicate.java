class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sh=new HashSet<>();

        for(int num:nums){
            if(sh.contains(num)){
                return true;
            }
            sh.add(num);
        }
        return false;
    }
}