class Solution {
    public String smallestPalindrome(String s) {
        char[] a = s.toCharArray();
        int len=a.length;
        int mid=len/2;

        Arrays.sort(a,0,mid);
        for(int i=0;i<mid;i++){
            a[len-1-i]=a[i];
        }
        return new String(a);
    }
}