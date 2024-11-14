package day3.stringandarrayprograms;
//print elements in reverse order
public class Two {
	public static void reverseOrder(String[] array) {
        for(int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
	public static void main(String[] args) {
        String[] array = {"jess", "jesse", "jesse james", "jesse frankfurt"};
        reverseOrder(array);
    }
}
