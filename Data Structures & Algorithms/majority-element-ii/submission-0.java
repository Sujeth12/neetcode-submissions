class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0 ; i < n ; i++){
            int count = map.getOrDefault(nums[i] , 0) + 1;

            map.put(nums[i] , count);

            if(count > n / 3 && !list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        return list;
 
        
    }
}