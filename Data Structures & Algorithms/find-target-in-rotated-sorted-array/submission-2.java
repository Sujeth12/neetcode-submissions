class Solution {
    public int search(int[] nums, int target) {

        int s = 0;
        int e= nums.length-1;
        int pivot = pivot(nums);

        if(pivot != -1){
        if(nums[s] > target){
                s = pivot+ 1;
            }
            else{
                e = pivot;
            }
        }       
        while(s <= e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
        
    }
    public int pivot(int[] nums){
        int s = 0;
        int e = nums.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(e > mid && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(s < mid && nums[mid] < nums[mid - 1]){
                return mid - 1;
            }
            if(nums[s] >= nums[mid]){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return -1;
    }
    
}
