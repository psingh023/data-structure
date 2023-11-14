package ds.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	
	public void insert(long j) {
		if(rear == maxSize -1) {
			rear = -1;
		}
		rear++;
		queueArray[rear] = j;
		nItems++;
	}
	
	public long remove(){ //remove the item from the front of the queue
		long temp = queueArray[front];
		front++;
		if(front == maxSize) {
			front = 0;
		}
		nItems--;
		return temp;
	}
	
	public long peekFront() {
		return queueArray[front];
	}
	
	public boolean isEmpty() {
		return (nItems == 0);
	}
	
	public boolean ifFull(){
		return (nItems == maxSize);
	}
	
	public void view(){
		System.out.println("[");
		for(int i=0; i < queueArray.length; i++ ) {
			System.out.println(queueArray[i] + "");
		}
		System.out.println("]");		
	}
	
}
