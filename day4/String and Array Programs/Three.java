package day4.stringandarrayprograms;
//remove even duplicate element in given array
public class Three {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 40, 60, 70, 80, 90, 100, 100 };
		for(int i = 0; i <= arr.length; i++) {
				for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && arr[i] % 2 == 0) {
                	
                }
			}
		}
	}
}