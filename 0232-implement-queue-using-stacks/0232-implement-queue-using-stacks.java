class MyQueue{
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    public void push(int value){
        st1.push(value);
    }
    
    public int pop(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int removed = st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return removed;
    }
    public int peek(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int removed = st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return removed;
    }
    public boolean empty(){
        return st1.isEmpty();
    }
}
class Main {
    public static void main(String[] args) {
        
    }
}
