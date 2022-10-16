package basicjava;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner( System.in );
		int n;
		
		System.out.print( "Enter a Number : ");
		n = sc.nextInt();

		System.out.println( "The given number : " + n );
	}

}
