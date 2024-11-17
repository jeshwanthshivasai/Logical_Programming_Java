package day4.standardprograms;

import java.util.Scanner;

//print product of numbers from X to Y
public class Five {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the value of X: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the value of Y: ");
        int y = scanner.nextInt();
        
        for(int i = x; i <= y; i++) {
        	System.out.println(x + " * " + i + " = " + (x * i));
        }
	}
}
