package trabajos_programacion_def;

import java.util.Scanner;

public class Displaying_prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//the first 50 prime numbers in 5 lines, each contains 10 nums.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número para saber si es primo: ");
		
		
	int num = teclado.nextInt();
	
	
	boolean isprime = true;
	for (int divisor =2; divisor <= num/2 && isprime; divisor++)
		if (num%divisor ==0)
			isprime=false;
//resto=num%divisor 

	if (isprime)
		System.out.println(num+" es primo");
	else
		System.out.println(num+" no es primo");
	
	//while (num % divisor !=0 && divisor <= n/2)
}}
