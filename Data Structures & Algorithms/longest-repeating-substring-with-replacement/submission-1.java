class Solution {
    public int characterReplacement(String s, int k) {

       int[] arr = new int[26];

       int l = 0;
       int maxFreq = 0;
       int maxWindow = 0;

       for(int r =0;r<s.length(); r++){

        char right = s.charAt(r);
        int index = right - 'A';
        arr[index] = arr[index] +1;

        if(arr[index] > maxFreq){
            maxFreq = arr[index];
        }
        int window = r - l + 1;

        if(window - maxFreq > k){
            char left = s.charAt(l);
            int indexl = left - 'A';

            arr[indexl] = arr[indexl] - 1;
            l = l + 1;

            window = r - l + 1;
        }
        if(window > maxWindow){
            maxWindow = window;
        }
       }
       return maxWindow;
    }
}
