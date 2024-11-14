package day3.standardprograms;
//print divisors of a given number
public class Three {
	public static void printDivisors(int num) {
		System.out.println("Divisors of " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
	}
    public static void main(String[] args) {
        printDivisors(12);
    }
}
