class Solution {
     private static char[] R = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int base = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > 0) {
                char[] cur = curr(digit, base);
                sb.insert(0, cur);
            }
            num /= 10;
            base += 2;
        }
        return sb.toString();
    }

    private char[] curr(int digit, int base) {
        if (digit >= 1 && digit <= 3) {
            char[] res = new char[digit];
            Arrays.fill(res, R[base]);
            return res;
        } else if (digit == 4) {
            return new char[]{R[base], R[base+1]};
        } else if (digit == 5) {
            return new char[]{R[base+1]};
        } else if (digit >= 6 && digit <= 8) {
            char[] res = new char[digit-5+1];
            Arrays.fill(res, R[base]);
            res[0] = R[base+1];
            return res;
        } else { // 9
            return new char[]{R[base], R[base+2]};
        }
    }


    
    public static String intToRoman2(int num) {
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
    }
}