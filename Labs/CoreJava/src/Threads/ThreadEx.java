package Threads;

import java.util.Scanner;

public class ThreadEx {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("thread is sleeping");
		Thread.sleep(1000);
		System.out.println("thread woke up");
		
		Scanner sc=new Scanner(System.in);
		System.out.println(sc.nextLine());
		System.out.println(Thread.currentThread().getName());

	}

}
