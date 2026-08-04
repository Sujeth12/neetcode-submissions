class Solution {
    public int[] twoSum(int[] num, int target) {

        int s = 0;
        int e = num.length-1;
        int sum =0;

        while(s <=e){
            sum = num[s] + num[e];

            if(sum == target){
                return new int[]{s+1,e+1};
            }
            else if(sum > target){
                e--;
            }
            else{
                s++;
            }
        }
        return new int[]{-1,-1};
        
    }
}
