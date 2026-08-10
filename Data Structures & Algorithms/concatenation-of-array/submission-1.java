class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //create an array of double size
        int[] arr = new int[n * 2];
        //loop once the entire array
        for(int i = 0 ; i < n ; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        return arr;
    }
}