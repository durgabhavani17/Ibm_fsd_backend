package Threads;

public class CounterDemo {
	public static Counter count = null;

	public static class CounterThread implements Runnable {

		@Override
		public  void run() {
			synchronized(count) {
			count.increment();
			count.increment();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count.decrement();
			System.out.println(count.getVlaue());
			}
			

		}

	}

	public static void main(String[] args) {
		count = new Counter();
		Thread t1 = new Thread(new CounterThread());
		t1.start();
		Thread t2 = new Thread(new CounterThread());
		t2.start();
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");

	}

}
