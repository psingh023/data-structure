package ds.stack;

public class App {

	public static void main(String[] args) {
//		Stack newStack = new Stack(5);
//		newStack.push('H');
//		newStack.push('E');
//		newStack.push('L');
//		newStack.push('L');
//		newStack.push('O');
		
		System.out.println(reverseString("Hello"));
		
//		while(!newStack.isEmpty()) {
//			char value = newStack.pop();
//			System.out.println(value);
//		}	
		
		//Should return Empty Stack message
		//All array value popped already 
//		newStack.pop();
	}
	
	public static String reverseString(String str) {
		int strSize = str.length();
		Stack newStack = new Stack(5);
		for(int i = 0; i < strSize; i++) {
		 char newChar = str.charAt(i);
		 newStack.push(newChar);
		}
		
		String reversedStr = "";
		
		while(!newStack.isEmpty()) {
			char value = newStack.pop();
			reversedStr = reversedStr + value;
		}
		
		return reversedStr;
	} 
}
