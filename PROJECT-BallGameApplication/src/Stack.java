
public class Stack {
    Node top;
    int size;
    int count;
    
    public Stack(int size) {
        this.size = size;
    }
    
    public void push(int data){
        Node dugum = new Node(data); 
        if(isFull()){
            System.out.println("--- FULL ---");
        }else if(isEmpty()){
            top = dugum;
            count++;
        }else{
            dugum.next = top;
            top = dugum;
            count++;
        }
    }
    
    public void top(){
        if(isEmpty()){
            System.out.println("--- EMPTY ---");
        }else{
            System.out.println("Top : " + top.data);
        }
    }
    
    public void pop(){
        if(isEmpty()){
            System.out.println("--- EMPTY ---");
        }else if(top.next == null){
            top = null;
            count--;
        }else{
            System.out.println("Pop(" + top.data + ") -->");
            top = top.next;
            count--;
        }
    }
    
    public void print(){
        if(isEmpty()){
            System.out.println("--- EMPTY ---");
        }else if(top.next == null){
            System.out.println(top.data);
            System.out.println("|");
        }else{
            Node tmp = top;
            while(tmp != null){
             System.out.println(tmp.data);
             System.out.println("|");
                tmp = tmp.next;
            }
        }
        
        
    }
    
    public boolean isFull(){
        return (count == size);
    }
    
    public boolean isEmpty(){
        return (count == 0);
    }
    
}
