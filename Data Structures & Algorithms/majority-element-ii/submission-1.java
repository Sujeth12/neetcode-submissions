class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        //create an arraylist
        List<Integer> list = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int count = map.getOrDefault(nums[i] , 0) + 1;

            map.put(nums[i] , count);
            //MAIN LINE IF LIST DOES NT CONTAINS THIS THEN ONLY ADD TO IT
            if(count > n / 3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
 
        
    }
}