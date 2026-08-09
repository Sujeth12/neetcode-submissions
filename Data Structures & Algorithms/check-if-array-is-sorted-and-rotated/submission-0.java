class Solution {
    public boolean check(int[] nums) {
        int deviations = 0;


        for(int i = 0; i<nums.length; i++){
            if(i < nums.length -1 && nums[i] > nums[i+1]){
                deviations++;
            }
            else if(i == nums.length -1 && nums[nums.length -1] > nums[0]){
                 deviations++;               
            }
        }
        return deviations > 1 ? false : true;
    }
}