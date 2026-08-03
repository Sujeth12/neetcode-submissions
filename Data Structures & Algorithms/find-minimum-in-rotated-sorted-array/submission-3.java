class Solution {
    public int findMin(int[] nums) {
        // findPivot(nums);
        int ans = findPivot(nums);
        if(ans == -1){
            return nums[0];
        }
        return nums[ans + 1];
    }
    public int findPivot(int[] arr){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e-s) / 2;

            if(mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[s] >= arr[mid]){
                e = mid - 1;
            }
            else{
                s= mid +1;
            }
        }
        return -1;
    }
}
