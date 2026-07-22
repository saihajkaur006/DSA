class Solution {
    public int hammingWeight(int n) {
        int cnt=Integer.bitCount(n);
        return cnt;
    }
}