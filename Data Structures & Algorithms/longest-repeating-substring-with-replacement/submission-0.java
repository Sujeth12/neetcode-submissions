class Solution {
    public int characterReplacement(String s, int k) {

       int[] arr = new int[26];

       int left = 0;
       int maxfreq = 0;
       int maxWindow = 0;

       for(int right = 0 ; right < s.length(); right ++){
        //checks character
        char character = s.charAt(right);

        //changes to int index
        int index = character - 'A';

        //stores andaddsto array + 1
        arr[index] = arr[index] + 1;   

        if(arr[index] > maxfreq){
            maxfreq = arr[index];
        }  

        int window = right - left + 1;


        if(window - maxfreq > k){
            char leftchar = s.charAt(left);
            int index2 = leftchar - 'A';

            arr[index2] = arr[index2] - 1;

            left = left + 1;

            window = right - left +1;
        }
        if(window > maxWindow){
            maxWindow = window;
        }

       }
       return maxWindow;


        
    }
}
