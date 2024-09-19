package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("Intput an Integer for n: ");
	int n = in.nextInt();
	boolean [] primes = new boolean[n];
	
	
	for (int i = 2; i < n; i++) {
		primes[i] = true;}
	
	for (int i = 2; i < Math.sqrt(n); i++) {
		
		if (primes[i] == true)
		{
			for (int j=i*i; j < n; j+=i)
			{	
				primes[j] = false;
				
			}
		}
	}
	for (int j=2; j<n ; j++)
	{
		if (primes[j] == true) {
			System.out.print(j + " ");
		}
	}
	}

}
