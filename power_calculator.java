import java.util.Scanner;

public class power_calculator {
    static int power(int n, int p) {
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result *= n;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayi : ");
        int a = input.nextInt();
        System.out.print("Ust Sayi :");
        int b = input.nextInt();
        System.out.println("Sonuc : " + power(a, b));
    }
}
