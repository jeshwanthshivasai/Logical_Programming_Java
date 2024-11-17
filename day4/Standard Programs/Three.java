package day4.standardprograms;

import java.util.Scanner;

//print sum of numbers from X to Y
public class Three {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.print("Enter the value of X: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the value of Y: ");
        int y = scanner.nextInt();
        
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from " + x + " to " + y + " is: " + sum);
	}
}
