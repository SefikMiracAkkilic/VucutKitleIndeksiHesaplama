import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Boyunuz Giriniz : ");
        double boy = scanner.nextDouble();

        System.out.print("Kilonuzu Giriniz : ");
        double kilo = scanner.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks );

    }
}