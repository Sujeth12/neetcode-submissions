class Solution {
    public void sortColors(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int mid = 0;
        while(mid <=e){
            if(nums[mid] == 0){
                swap(nums,s,mid);
                mid++;
                s++;
            }
            else if(nums[mid] == 2){
                swap(nums,e,mid);
                e--;
            }
            else{
                mid++;
            }
        }
        
    }
    public void swap(int[] arr,int s , int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e]=temp;
    }
}