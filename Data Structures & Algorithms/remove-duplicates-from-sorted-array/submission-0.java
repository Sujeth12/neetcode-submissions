class Solution {
    public int removeDuplicates(int[] nums) {
        //TWO POINTER APPROACH
        int i = 0;
        //SECONDPOINTER CMAPRES WITH FIRST
        for(int j = 1; j < nums.length ; j++){
            //IF NOT EQUAL MEANS I++ FIRST BECAUSE THE i = 0 at 
            //first it must unique
            if(nums[i] != nums[j]){
                //MAIN
                i++;
                nums[i] = nums[j];
            }
        }
        //MAIN
        return i+1;
    }
}