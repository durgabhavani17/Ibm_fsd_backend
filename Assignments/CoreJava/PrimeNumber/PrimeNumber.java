package com.example.core.java;

public class PrimeNumber {

	static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		for(int i = 2 ; i < n ; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 1, end = 20;
		for(int i = start ; i <= end ; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}

}
