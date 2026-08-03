class Solution {
    public int maxArea(int[] arr) {

        int s = 0;
        int e = arr.length - 1;
        int max = 0;
        while( s < e){
                int len = Math.min(arr[s] ,arr[e]);
                int bre = e - s;
                int total = len * bre;

                if(arr[s] > arr[e]){
                    e--;
                }
                else{
                    s++;
                }
            max = Math.max(max , total);
        }
        return max;  
    }
}
