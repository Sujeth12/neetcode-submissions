class Solution {
    public int subarraySum(int[] nums, int k) {
        //Use the hash map for storing
        HashMap<Integer, Integer> map = new HashMap<>();
        //MAIN
        map.put(0 , 1);
        //running sum
        int sum = 0;
        //we need to return how many count
        int count = 0;
        for(int i = 0; i< nums.length ; i++){
            sum = sum + nums[i];
            //if that sum contains the value of that  
            if(map.containsKey(sum - k)){
                //if it contains in map then increase it
                count = count + map.get(sum- k);
            }
            //RUNNING SUM CALCULATION // PREFIX SUM
            map.put(sum , map.getOrDefault(sum , 0) + 1);
        }
        return count;
    }
}