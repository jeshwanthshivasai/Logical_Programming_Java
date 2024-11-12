import java.util.Arrays;

public class four {
    public static void MergeArray(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for(int i=0; i<arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        int index = arr1.length;
        for(int i=0; i<arr2.length; i++) {
            arr3[index++] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
//        for(int i=0; i<arr3.length; i++) {
//        	System.out.println(arr3[i]);
//        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6, 7, 8, 9, 10, 11};
        int[] arr2 = {12, 14, 16};
        MergeArray(arr1, arr2);
    }
}
