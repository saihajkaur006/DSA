class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String w=words[i].toLowerCase();
            StringBuilder sb = new StringBuilder(w);
            if(sb.reverse().toString().equals(w)){
                return w;
                
            }
            
        }
        return "";
        
    }
}