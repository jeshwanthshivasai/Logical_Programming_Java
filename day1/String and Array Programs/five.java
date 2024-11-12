public class five {
    public static void commonElements(int[] arr1, int[] arr2) {
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; i<arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {1, 14, 6, 7};
        commonElements(arr1, arr2);
    }
}
