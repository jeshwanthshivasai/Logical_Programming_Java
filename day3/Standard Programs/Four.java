package day3.standardprograms;
//print multiplication table of 8
public class Four {
	public static void main(String[] args) {
		int num = 8;
        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
	}
}
