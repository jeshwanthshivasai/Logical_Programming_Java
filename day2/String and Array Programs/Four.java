package day2.stringandarrayprograms;
//print smallest number in the array
public class Four {
	public static void main(String[] args) {
		int[] arr = {12, 45, 67, 89, 101, 112};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest number in the array: " + smallest);
	}
}
