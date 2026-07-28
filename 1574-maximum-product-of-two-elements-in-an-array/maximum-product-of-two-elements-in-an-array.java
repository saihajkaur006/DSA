class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;             // largest, second largest

        for (int x : nums)
        {
            if (x > max1)
            {
                max2 = max1;                // demote old champion
                max1 = x;                   // new champion
            }
            else if (x > max2)
            {
                max2 = x;                   // new runner-up
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}