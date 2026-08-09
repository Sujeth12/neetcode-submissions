class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int n = temp.length;
        int[] res = new int[n];

        for(int i = n-1; i>= 0 ; i--){
            //after filling the first element 
            //check the current value is greater than stack peek 
            //if yes then we need to pop that
            while(!stack.isEmpty() && temp[i] >= temp[stack.peek()]){
                stack.pop();

            }
            //if above satisfies then we need to find the distance 
            //Between the current element of index and peek element index
            //MAIN THIS STACK IS CONTAINS THE INDEX 
            if(!stack.isEmpty()){
                res[i] = stack.peek() - i;
            }
            //pushes first element
            //contains the index values
            stack.push(i);

        }
        return res;
    }
}
