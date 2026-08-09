class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;

        int max = 0;

        for(int pile : piles){
            max = Math.max(max , pile);
        }

        while(min < max){
            int mid = min + (max -min) / 2;
            if(minhours(piles , h , mid)){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        return min;
    }

    public boolean minhours(int[] piles , int h , int mid){
        int hours = 0;

        // for(int pile : piles){
        //     hours += (int) Math.ceil((double)pile / mid);
        // }

        for(int pile : piles){
            hours += (pile + mid -1) / mid;
        }
        return hours <=h;
    }
}
