package algorithmconcepts;

public class Queue {

	int[] q=new int[5];
	int insert;
	int delete;
	
	Queue() {
		insert = -1;
		delete = 0;
	}
	void enqueue(int n) {
		if(insert==q.length-1)
			System.out.println("The Queue is full");
		else
		   q[++insert]=n;
	}
	int dequeue() {
		if(delete>=0)
			return q[delete++];
		else
			System.out.println("The Queue is empty");
		return 0;
		
		
	}
}
