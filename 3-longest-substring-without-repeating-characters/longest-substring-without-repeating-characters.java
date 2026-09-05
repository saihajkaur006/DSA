class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0,max=0;

        int hashlen=256;
        int[] hash = new int[hashlen];
        Arrays.fill(hash,-1);

        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                l=Math.max(l,hash[s.charAt(r)]+1);
            }
            int len=r-l+1;
            max=Math.max(len,max);

            hash[s.charAt(r)]=r;
            r++;
        }
        return max;
        
    }
}