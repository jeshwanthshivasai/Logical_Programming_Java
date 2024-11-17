package day4.standardprograms;
//prinnt sum of natural numbers from 1 to 10
public class Two {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum+=i;
		}
		System.out.println("Sum of natural numbers from 1 to 10 is: " + sum);
	}
}
