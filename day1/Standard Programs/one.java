import java.util.Scanner;

class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        for(int i=0; i<=25; i++) {
            System.out.println(username);
        }
    }
}