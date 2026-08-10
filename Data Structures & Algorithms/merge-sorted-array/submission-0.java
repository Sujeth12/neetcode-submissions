class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 last element
        int i = m-1;
        //nums2 last elemt
        int j = n-1;
        //combinedlast
        int k = m+n-1;
        //we need to check the both always >=0;
        while( j >=0 && i>=0){

            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
        //when i overs then remaining elements would be added by the j
        //if j overs we didnt loop this because its already sorted
        while(j >=0){
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
}