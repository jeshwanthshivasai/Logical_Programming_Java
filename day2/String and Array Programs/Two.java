package day2.stringandarrayprograms;
//print elements in descending order
public class Two {
	public static void descendingOrder(int[] array) {
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
		descendingOrder(array);
	}
}
