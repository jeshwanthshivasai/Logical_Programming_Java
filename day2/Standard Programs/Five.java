package day2.standardprograms;

import java.util.Scanner;

//print even numbers from x to y
public class Five {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the end number (y): ");
        int y = sc.nextInt();
        for(int i = x; i <= y; i++) {
        	if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
	}
}
