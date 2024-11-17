package day4.stringandarrayprograms;
//print even largest element present in given array
public class Five {
	public static void main(String[] args) {
		int[] arr = { 71, 20, 30, 40, 50 };
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Even Largest Element: " + max);
	}
}
