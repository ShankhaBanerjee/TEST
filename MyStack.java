package demo.test;

//public class MyStack {
//}

//Stack implementation in Java

public class MyStack {

private int arr[];
private int top;
private int capacity;


MyStack(int size) 
{
	arr = new int[size];
	capacity = size;
	top = -1;
}


// Push Operations
public void push(int x) 
{
 if (isFull()) {
   System.out.println("Stack OverFlow");
   System.exit(1);
 }

// Insert Operation
 System.out.println("Inserting : " + x);
 arr[++top] = x;
}

// Pop Operations
public int pop() {

 // if stack is empty
 // no element to pop
 if (isEmpty()) {
   System.out.println("STACK EMPTY");
   // terminates the program
   System.exit(1);
 }

 // pop element from top of stack
 return arr[top--];
}

// return size of the stack
public int getSize() {
 return top + 1;
}

// check if the stack is empty
public Boolean isEmpty() {
 return top == -1;
}

// check if the stack is full
public Boolean isFull() {
 return top == capacity - 1;
}

// display elements of stack
public void printStack() {
 for (int i = 0; i <= top; i++) {
   System.out.print(arr[i] + ", ");
 }
}

public static void main(String[] args) {
 MyStack stack = new MyStack(5);

 stack.push(1);
 stack.push(2);
 stack.push(3);
 stack.push(4);
 stack.push(5);

 System.out.print("Stack Elements : ");
 stack.printStack();

 // remove element from stack
 stack.pop();
 System.out.println("\nAfter popping out");
 stack.printStack();
 //System.out.println("The poped out elements is :" + top);

}
}
