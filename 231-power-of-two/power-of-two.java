class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return (n&(n-1))==0;









        //     1000
    //         & 0111
    //       ------
    //        0000

    // the power if 2 number always conatin only 1 in it so if we do and with its reverse if we get the 0 then that means its power of 2 otherwise not 
    }
}