import java.util.Scanner;

class Stack{
   private int a [];
   private int capacity;
   private int top;
   
   // creating a parameterized constructor to assign the value on demand;
   
        Stack(int size){
            this.capacity = size;
            this.top = -1;
            this.a = new int[size];
            
            System.out.println(size+" size Stack created successfully");
        }
        
        
        
    // crating some stacks basic operations..
    
    void push(int data){
        
        // this function will first check either stack has space or not.
        
        if(top<capacity-1){
            a[++top] = data;
            System.out.println(data+" pushed into Stack.");
        }
        else{
            System.out.println("Stack OverFlow.");
        }
    }
    
    int pop (){
        if(top == -1){
            System.out.println("Stack UnderFlow.");
            return-1;
        }
        else{
            int temp = a[top--];
            System.out.println(temp +" popped..");
            return temp;
        }
    }
    
    int peek(){
        if(top>=0){
            System.out.println(a[top]);
            return a[top];
        }
        else{
            System.out.println("Stack UnderFlow.");
            return -1;
        }
    }
    
    boolean isEmpty(){
        if(top == -1){
            System.out.println("isEmpty: true");
            return true;
        }
        else{
            System.out.println("isEmpty: false");
            return false;
        }
    }
    
    boolean isFull(){
        if(top==capacity-1){
            System.out.println("isFull: true");
            return true;
        }
        else{
            System.out.println("isFull: false");
            return false;
        }
    }
    
    int avlSpace(){
        System.out.println("avlSpace: "+(capacity-(1+top)));
        return (capacity-(1+top));
    }
    
    int count(){
        System.out.println((top+1)+" Elements available.");
        return top+1;
    }
    
    void change(int data){
        if(top==-1){
            System.out.println("Stack UnderFlow.");
            
        }
        else{
           
            System.out.println(a[top]+ " updated into "+data);
            a[top]=data;
        }
        
    }
    void display(){
        if(top ==-1){
            System.out.println("Stack UnderFlow.");
        }
        else{
            for(int i = capacity-1; i>top; i--){
                System.out.println("|  -  |");
            }
            
            for(int i =top; i>=0; i--){
                System.out.println("|  "+a[i]+"  |");
            }
            System.out.println("-------");
        }
    }
    
    
    
}

class Main{
    
    public static void main(String args[]){
        
        System.out.println("Welcome to the Stack Data Structure..");
        
        Stack s = new Stack (5);
        s.push(2);
        s.push(3);
        s.push(7);
       
        s.avlSpace();
        s.count();
        s.change(4);
    
        s.display();
    }
}
