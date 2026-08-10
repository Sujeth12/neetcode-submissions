class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //create an array of double size
        int[] arr = new int[n * 2];
        //loop once the entire array
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[i];
        }
        //continue the index by denoting the index as last index
        int index = nums.length;
        //continue where you stopped
        for( int i = 0; i < nums.length ; i++){
            arr[index] = nums[i];
            //MAIN INDEX WOULD BE INCREASE
            index++;
        }
        return arr;
    }
}