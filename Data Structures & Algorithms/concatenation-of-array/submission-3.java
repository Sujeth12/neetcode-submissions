class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //create an array of double size
        int[] arr = new int[n * 2];
        //Same loop 
        for(int i = 0 ; i < n ; i++){
            //fill the array once
            arr[i] = nums[i];
            //fill the second half with that one MAIN ONE
            arr[i+n] = nums[i];
        }
        return arr;
    }
}