class Solution {
    public String longestPalindrome(String s) {
        char[] input = s.toCharArray();
        int length = input.length;
        if (length == 1) {
            return s;
        }

        String output = "";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 2; j++) {
                int left = i;
                int right = i + j;
                while (left >= 0 && right < length && input[left] == input[right]) {
                    left--;
                    right++;
                }
                left++;
                right--;
                if (output.length() < right - left + 1) {
                    output = String.valueOf(Arrays.copyOfRange(input, left, right+1));
                }
            }
        }

        return output;
    }
}