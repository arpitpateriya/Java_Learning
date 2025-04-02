package StackLab;

public class StackImplementation {

}

class Stack{
    private int arr[];
    private int top;
    private int capacity;


    Stack(int size){
        arr =new int [size];//create an array of given size
        capacity=size;//set the capacity
        top=-1;// stack is initially emty

    }
public void push(int X){


        if (isFull()){
            System.out.println("Stack overflow");
            System.exit(1);

        }
    System.out.println("Inserting"+X);
        arr[++top]=X;//increment top and insert the element
}
public int pop(){
        if(isEmpty()){///check if stack is empty
            System.out.println("STACK EMPTY");
            System.exit(1);//exit the program

        }
        return arr[top--];//return and remove top element
}
public int getsize(){
        return top +1;//size is (top index +1)
}


public Boolean isEmpty(){
        return top ==-1;//true if stack is empty

}
public Boolean isFull(){
        return top ==capacity-1;//true if stsck is full
}
public void printStack(){
        for(int i=0;i<=top;i++){
        System.out.println(arr[i]+", ");
    }
}



public static void main(String[]args){
        Stack stack=new Stack(5);
        stack.push(14);
    stack.push(2);
    stack.push(73);
    stack.push(8);
    stack.push(10);
    System.out.println("Stack: ");
    stack.printStack();
    stack.pop();
    System.out.println("\nAfter popping out");
    stack.printStack();
}
}


