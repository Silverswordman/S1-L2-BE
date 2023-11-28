package Es4;

import java.util.Scanner;

public class Es4 {

    public static void countDown(int numero) {

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero ");
        int numero = scanner.nextInt();

        countDown(numero);

        scanner.close();
    }
}
