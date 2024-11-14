package day3.stringandarrayprograms;
//print 2nd smallest element in a given array
public class One {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
        int smallest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
            	arr[i] = smallest;
            }
        };
	}
}
