package day2.standardprograms;
//print 1 - 10 natural numbers except 5
public class Two {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
            if (i!=5) {
                System.out.print(i + " ");
            }
        }
        System.out.println();;
	}
}
