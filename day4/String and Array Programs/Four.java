package day4.stringandarrayprograms;
//merge  even elements present in two arrays
public class Four {
	public static void mergedArray(int[] arr1, int[] arr2) {
		int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;
        
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0) {
                mergedArray[index++] = arr1[i];
            }
        }
        
        for(int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 == 0) {
                mergedArray[index++] = arr2[i];
            }
        }
        
        System.out.println("Merged Array: ");
        for(int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        mergedArray(arr1, arr2);
	}
}
