package day2.standardprograms;

import java.util.Scanner;

//print natural number from x to y
public class Four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter the end number (y): ");
        int y = sc.nextInt();
        
        for(int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        sc.close();
	}
}
