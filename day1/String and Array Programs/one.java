public class one {
    public static void duplicate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7,};
        duplicate(arr);
    }
}
