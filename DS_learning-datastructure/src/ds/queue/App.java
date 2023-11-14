package ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(600);
		myQueue.insert(500);
		myQueue.insert(54);
		myQueue.insert(12);
		myQueue.insert(85);
		myQueue.insert(66);
		myQueue.insert(66);
		myQueue.insert(66);
		myQueue.view();	
	}

}
