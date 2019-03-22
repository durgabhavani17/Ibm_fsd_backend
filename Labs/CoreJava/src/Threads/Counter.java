package Threads;

public class Counter {
	public int count;
	public synchronized void increment(){
		count++;
	}
	public synchronized void decrement() {
		count--;
	}
	public int getVlaue() {
		return count;

	}
}
