class Solution {
    public int maxProfit(int[] arr) {
        //Buy prize is at first
        int buy_prize = arr[0];
        int profit =0;
        //start with i = 1 
        for(int i = 1 ; i < arr.length ; i++){
            //find the min value between them and swap
            if(arr[i] < buy_prize){
                buy_prize = arr[i];
            }
            else{
                //If not minimum then current element - buy prize
                int current = arr[i] - buy_prize;
                profit = Math.max(profit , current);
            }
        }
        
        return profit;
    }
}
