class Solution {
    public String reverseWords(String s) {

        //store words in array
        String[] words=s.trim().split("\\s+");
        StringBuilder res= new StringBuilder();

        //store words in reverse order by iterating in array
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i!=0){
                res.append(" ");
            }
        }
        return res.toString();
    }
}