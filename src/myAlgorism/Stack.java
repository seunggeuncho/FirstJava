package myAlgorism;
import java.util.ArrayList;

public class Stack {
	int ptr;
	int [] arr;
	int capacity;
	
	public class EmptyStackException extends RuntimeException {
		
	}
	
	Stack(int capacity){
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.ptr = 0;
	}
	public void push(int val) {
		this.arr[ptr] = val;
		this.ptr += 1;
	}
	public void pop() {
		int pop = this.arr[ptr];
		this.arr[ptr--] = 0;
	}
	public int getCapacity() {
		return this.capacity;
	}
	
	public int indexOf(int val) {
		for(int i = 0; i < arr.length;i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}
	
}
