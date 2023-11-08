package ds.stack;

public class Stack {

	private int maxSize;
	private char[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char a) {
		if(isFull()) {
			System.out.println("Cannot add: " + a + "  reached max value of array");
		} else {
			top++;
			stackArray[top] = a;
		}
	}
	
	public char pop(){
		if(isEmpty()) {
			System.out.println("Cannot pop anymore the Stack is empty");
			return '0';
		}
		else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}
	
	public char peak() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return(maxSize-1 == top);
	}
}
