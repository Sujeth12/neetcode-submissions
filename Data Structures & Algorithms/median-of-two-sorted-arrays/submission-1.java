class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedList = new ArrayList<>();
        for (int num : nums1) mergedList.add(num);
        for (int num : nums2) mergedList.add(num);
        Collections.sort(mergedList);
        int firstClassic = mergedList.get(0);
        int lastClassic = mergedList.get(mergedList.size() - 1);

        int size = mergedList.size();
        int mid = size / 2; 

        if(size % 2 == 0){
            int mid1 = mergedList.get(mid - 1);
            int mid2 = mergedList.get(mid);

            return (double) (mid1 + mid2) / 2;
        }
        else{
            return mergedList.get(mid);
        }

    }
}
