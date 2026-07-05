class Solution {
     public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }

        int start = 0;
        int ll = 1;
        Map<Character, Integer> found = new HashMap<>();
        found.put(s.charAt(0), 0);
        int i;
        for (i = 1; i < s.length(); i++) {
            if (found.containsKey(s.charAt(i))) {
                int newStart = remove(start, i, s.charAt(i), found, s);

                if (i - start > ll) {
                    ll = i - start;
                }
                start = newStart;
            } else {
                found.put(s.charAt(i), i);
            }
        }

        return Math.max(ll, i - start);
    }

    private int remove(int start, int now, char re, Map<Character, Integer> found, String s) {
        int j;
        for (j = start; j < now; j++) {
            if (s.charAt(j) == re) {
                found.remove(s.charAt(j));
                break;
            }
            found.remove(s.charAt(j));
        }
        found.put(s.charAt(now), now);
        return j + 1;
    }

}