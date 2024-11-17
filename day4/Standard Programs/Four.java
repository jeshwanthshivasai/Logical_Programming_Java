package day4.standardprograms;
//print product of natural numbers from 1 to 10
public class Four {
	public static void main(String[] args) {
		int product = 1;
        for (int i = 1; i <= 10; i++) {
            product *= i;
        }
        System.out.println("Product of natural numbers from 1 to 10: " + product);
	}
}
