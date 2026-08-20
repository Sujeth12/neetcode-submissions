class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String s:details){
            int a = s.charAt(11) - '0'; 
            int b = s.charAt(12)- '0';

            int res = a*10 +b ;

            if(res > 60){
                count ++;
            }
        }
        return count;
    }
}