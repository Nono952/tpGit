package tpGit.tpGit;

import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


class Fibonacci {
	
	 private static Logger logger = Logger.getLogger(Fibonacci.class);
	  
	public static void main(String[] args) {
		//BasicConfigurator.configure();
		int c = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Choisir une valeur y/n >> ");
		String choice = sc.nextLine();
		
		
		if(choice.equals("y")) {
			System.out.print("Entrez la valeur: ");
			c = sc.nextInt();
		}
		
		logger.info(c);
		for(int i=0; i<c; i++) {
			System.out.println(fib(i));
			logger.info(fib(i));
		}
	}
	
	public static int fib(int n) {
		if (n < 2) return(n);
		return(fib(n-2) + fib(n-1));
	}
}