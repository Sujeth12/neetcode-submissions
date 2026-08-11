class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //change the string to char array
        for(char c : s.toCharArray()){
            //push th reverse symbols
            if(c == '('){
                stack.push(')');
            }
            else if(c == '{'){
                stack.push('}');

            }
            else if(c == '['){
                stack.push(']');
            }
            //MAIN IF ][][ IF THIS GIVEN THEN ABOVE ALL DOESNT WORK
            //THATS WHY STACK IS EMPTY AT BEGINNING SO ITS NOT VALID
            //THEN IF ONE IS WRONG THE OR CONDITION SATISFIES
            //THEN STACK.POP MUST BE EQUAL TO TOP BRACKET
            else if(stack.isEmpty() || stack.pop() !=c){
                return false;
            }
        }
        //IF ALL OVER THEN STACK BECOMES EMPTY ITS VALID 
        return stack.isEmpty();
    }
}
