class Solution {
    List<String> result = new ArrayList<>();
    void backtrack(String s,int n,char prev){
        if(s.length()==n){
            result.add(s);
            return;
        }
        
        if(prev !='0'){
            backtrack(s +"0",n,'0');
        }
        backtrack(s + "1",n,'1');
    }
    public List<String> validStrings(int n) {
        result.clear();
        backtrack("",n,'1');
        return result;
    }
}