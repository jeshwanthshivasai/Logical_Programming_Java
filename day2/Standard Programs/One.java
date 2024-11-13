package day2.standardprograms;
//print natural numbers from 1 - 10 except 3 & 8
public class One {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i == 3 || i == 8) {
				continue;
			}
			System.out.println(i);
		}
	}
}
