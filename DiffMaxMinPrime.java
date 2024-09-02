package mylearning;

import java.util.Scanner;

public class DiffMaxMinPrime {
	
	public static void main(String [] args) {
		
		//Scanner sc = new Scanner (System.in);
		int size = 7;
	int arr[] = {15,45,12,13,6,7,4};
	
		System.out.println(diffMaxMin(arr));
		
	}

	private static int diffMaxMin(int[] arr) {
		
		
		int maxPrime = Integer.MIN_VALUE;
		int minPrime = Integer.MAX_VALUE;
		
		boolean foundPrime = false;
		
		for(int num : arr) {
			if(isPrime(num))
			{
				foundPrime= true;
				maxPrime = Math.max(maxPrime, minPrime);
				minPrime = Math.min(minPrime, maxPrime);
			}
		}
		return foundPrime ? maxPrime - minPrime : 0;
	
	}

	private static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i ==0) 
			{
				return false;
			}
		}
		return true;
	}
}
