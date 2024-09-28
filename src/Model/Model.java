package Model;
import java.util.Scanner;

public class Model {
    public static void recursiveOperation(int n) {
        System.out.print(n + " ");
        if (n <= 0) {
            return;
        }

        recursiveOperation(n - 5);

        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        recursiveOperation(num);

        scanner.close();
    }
}
