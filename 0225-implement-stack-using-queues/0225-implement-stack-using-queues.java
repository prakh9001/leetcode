class MyStack{
    Deque<Integer> q = new ArrayDeque<Integer>();
    public void push(int value){
        q.push(value);
        
    }
    
    public int pop(){
        return q.remove();
    }
    
    public int top(){
        return q.peek();
    }
    
    public boolean empty(){
        return q.isEmpty();
    }
}
class Main{
    public static void main(String[] args){
        
    }
}