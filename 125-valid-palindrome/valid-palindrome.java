class Solution {
    public boolean isPalindrome(String s) {
        return checkPalin(s,0,s.length()-1);
    }
    private boolean checkPalin(String s,int left,int right){
        while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(left>=right) return true;
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) return false;
        return checkPalin(s,left+1,right-1);
    }
}