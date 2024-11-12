public class three {
    public static void evenIndex(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(i % 2 == 0) {
                System.out.println("Element at index " +  arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 7, 8, 9};
        evenIndex(arr);
    }
}
