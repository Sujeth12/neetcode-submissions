class Solution {
    public boolean check(int[] nums) {
        int deviations = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            //Normal one compares with one by one till last
            //But this formula will calculates the last element with first
            //The last element is comapred wit the first element 
            if(nums[i] > nums[(i+1) % n]){
                deviations ++;
            }
        }
        return deviations > 1 ? false : true;
    }
}