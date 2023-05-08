
// stack implementation using linked list in java

// create class Stack to make stack.

class Stack{
    
    // create static member class node to create node of the linkedlist
    
    static class Node{
        int data ;
        Node next;
        
        // create constructor to to create node for the stack.
        
        Node(int data){
            this.data = data;  // data will be assigned to the node data.
            this.next = null;  // initially next part is null
        }
    }
    
    
    
    // always create top as static so that it will be single top for all the nodes.
    // otherwise it will create multiple top and returns garbage results.
    
    static Node top = new Node(-1);
    
    
    
    // create push function to add data into the node.
    
     void push(int data){
        Node newnode = new Node(data);
        if(top.next == null){
            top.next = newnode;
        
            System.out.println("Node added successfully.");
        }
        else{
            newnode.next = top.next;
            top.next = newnode;
            System.out.println("Node added successfully.");
        }
    }
    
    
    // create isEmpty method to check either stack is empty or not.
    
     boolean isEmpty(){
        if(top.next == null){
            System.out.println("isEmpty: true");
            return true;
        }
        else{
            System.out.println("isEmpty: false");
            return false;
        }
    }
    
    
    
    // the peek method of the stack class returns the top most element of the stack.
    
     int peek(){
        if(top.next == null){
            System.out.println("StackUnderFlow.");
            return -1;
        }
        else{
            System.out.println(top.next.data);
            return top.next.data;
        }
    }


    // the pop method delete the topmost element and return the topmost element.
    
     int pop(){
        if(top.next == null){
            System.out.println("StackUnderFlow");
            return-1;
        }
        else {
            int n = top.next.data;
            System.out.println(n+" Popped.");
            top.next=top.next.next;
            return n;
            
        }
    }
    
    
    
    // the change method of the stack class change the topmost element of the stack.
    
     void change(int n){
        if(top.next == null){
            System.out.println ("StackUnderFlow");
        }
        else{
            top.next.data = n;
            System.out.println("Data updated successfully.");
        }
    }
    
    
    // display method of the stack class print the all the element of the stack.
    
     void display(){
        if(top.next == null){
            System.out.println("StackUnderFlow.");
        }
        else{
            Node pointer = top.next;
            while(pointer!=null){
                System.out.println(pointer.data);
                pointer=pointer.next;
            }
        }
    }
    
    
    
    // size method return the size of the stack.
    
     int size(){
        int count=0;
        if(top.next == null){
            System.out.println("StackUnderFlow.");
            return count;
        }
        else{
            Node ptr = top.next;
            while(ptr!=null){
                count++;
                ptr=ptr.next;
            }
            System.out.println("Size of the Stack: "+count);
            return count;
        }
    }
    
    
    
} // Stack class is ended here,  


class StackUsingLinkedList{
    public static void main(String args []){
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(3);
        s.push(9);
        s.isEmpty();
        s.peek();
        s.change(7);
        s.peek();
        s.display();
        s.size();
    }
}


