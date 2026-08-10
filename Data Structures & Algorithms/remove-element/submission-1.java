class Solution {
    public int removeElement(int[] nums, int val) {
        //initiallythe count is 0
        // MAIN WE NEED TO CREATE AN COUNT THEN MODIFY THE EXISTING ONE
        int count =0;

        for(int i = 0; i<nums.length ; i++){
            //if that value not equal to given value store it
            if(nums[i] != val){
                //Main once we need to store the numbers
                //IN THE EXISTING ARRAY 
                //
                nums[count] = nums[i];
                count++;
            }
        }
        return count;

        
    }
}