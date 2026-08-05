class Solution {
    public String shortestPalindrome(String s) {
        StringBuilder rev=new StringBuilder(s);
        rev.reverse();
        String str=s+"$"+rev;
        int[]LPS=lpscount(str);
        int ans=s.length()-LPS[LPS.length-1];
        String toAdd=rev.substring(0,ans);
        return toAdd+s;
    }
    private int[] lpscount(String s){
        int n=s.length();
        int i=1,j=0;
        int[]LPS=new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(j)){
                LPS[i]=j+1;
                i++;
                j++;
            }else{
                while(j>0 && s.charAt(i)!=s.charAt(j)){
                    j=LPS[j-1];
                }
                if(s.charAt(i)==s.charAt(j)){
                    LPS[i]=j+1;
                    j++;
                }
                i+=1;
            }
        }
        return LPS;
    }
}