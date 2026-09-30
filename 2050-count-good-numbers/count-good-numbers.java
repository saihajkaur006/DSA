class Solution {
    final long MOD=1000000007;
    private long modPow(long base,long exp){
        long res=1;
        base%=MOD;
        while(exp>0){
            if(exp%2==1){
                res=(res*base)%MOD;
            }
            base=(base*base)%MOD;
            exp/=2;
        }
        return res;
    }
    public int countGoodNumbers(long n) {
        long posi=(n+1)/2;
        long neg=(n)/2;
        long res=(modPow(5,posi)*modPow(4,neg))%MOD;
        return (int)res;
    }
}