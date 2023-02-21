package myAlgorism;

public class IntQue {
	private int[] que;
	private int capacity;
	private int front;
	private int rear;
	private int num;
	
	public IntQue(int maxlen) {
		this.num = this.rear = this.front = 0;
		this.capacity = maxlen;
		try {
		this.que = new int[capacity];
		} catch (OutOfMemoryError e) {
			capacity = 0;
		}
	}
	public int enque(int x) throws OverflowIntQueException{
		if (num >= capacity)
			throw new OverflowIntQueException();
		que[rear++] = x;
		num++;
		if(rear == capacity)
			rear = 0;
		return x;
	}
	public int deque() throws EmptyIntQueException {
		if (num <= 0) 
			throw new EmptyIntQueException();
		int x = que[front++];
		num--;
		if (front == capacity)
			front = 0;
		return x;
	}
	public int peek() throws EmptyIntQueException {
		if (num <= 0)
			throw new EmptyIntQueException();
		return que[front];
	}
	public void claer() {
		this.num = this.front = this.rear = 0;
	}
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % capacity;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
}
