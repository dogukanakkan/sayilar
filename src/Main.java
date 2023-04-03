import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int a = scanner.nextInt();

        System.out.print("2. sayıyı girin: ");
        int b = scanner.nextInt();

        System.out.print("3. sayıyı girin: ");
        int c = scanner.nextInt();

        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Büyükten küçüğe sıralanmış sayılar: " + a + ", " + b + ", " + c);

    }
}