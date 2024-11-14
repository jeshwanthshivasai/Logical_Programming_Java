package day3.standardprograms;

import java.util.Scanner;

//print numbers from x to y which are divisible by only 5
public class Two {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter Y: ");
        int y = scanner.nextInt();
        for (int i = x; i <= y; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
	}
}
