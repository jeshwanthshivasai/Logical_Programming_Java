package day3.stringandarrayprograms;
//print which numbers from 1st array are not present in 2nd array
public class Four {
	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] array2 = {4, 5, 6, 7, 8, 9, 10};
        
        for(int i = 0; i < array1.length; i++) {
            boolean isPresent = false;
            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    isPresent = true;
                    break;
                }
            }
            if(!isPresent) {
                System.out.print(array1[i] + " ");
            }
        }
	}
}
