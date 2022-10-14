import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz:");
        int sayi = scanner.nextInt();
        int carpim = 1;

        for (int i = 1; i <= sayi; i++) {
            carpim *=i;
        }
        System.out.print(sayi+" sinin faktoriyeli :"+carpim);


    }
}
