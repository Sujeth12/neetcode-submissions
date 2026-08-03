class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]",""); 

        int f = 0 ;
        int l = s.length() - 1;

        while( f <= l){
            if(s.charAt(f) != s.charAt(l)){
                return false;
            }
            l--;
            f++;
        }
        return true;

    }
}
