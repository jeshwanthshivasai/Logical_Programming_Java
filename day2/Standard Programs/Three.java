package day2.standardprograms;
//print 1-10 natural numbers except 5 using continue statement and while loop
public class Three {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
