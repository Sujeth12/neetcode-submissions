class Solution {
    public int[] sortArray(int[] nums) {

        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
    public void mergesort(int[] nums,int low,int high){
        if(low >= high){
            return;
        }
        int s = low;
        int e=high;
        int mid= s+ (e-s) / 2;
        int pivot = nums[mid];

        while(s <=e){
            while(nums[s] < pivot){
                s++;
            }
            while(nums[e] > pivot){
                e--;
            }

            if(s <=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        mergesort(nums,low,e);
        mergesort(nums,s,high);
    }
}