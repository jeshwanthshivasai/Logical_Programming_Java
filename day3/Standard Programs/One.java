package day3.standardprograms;

import java.util.Scanner;

//print odd numbers from x to y 
public class One {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the start number (x): ");
		int x = scanner.nextInt();
		System.out.print("Enter the end number (y): ");
		int y = scanner.nextInt();
		
        for (int i = x; i <= y; i++) {
        	if (i % 2!= 0) {
                System.out.print(i + " ");
        	}
        }
	}
}