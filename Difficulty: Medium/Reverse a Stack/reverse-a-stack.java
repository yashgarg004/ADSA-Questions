class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        if(st.isEmpty()) return ;
        
        int num = st.pop();
        reverseStack(st);
        newStack(st,num);
        
    }
    
    public static void newStack(Stack<Integer> st , int num){
        if (st.isEmpty()) {
            st.push(num);
            return;
        }

        int top = st.pop();
        newStack(st, num);
        st.push(top);
    }
}
