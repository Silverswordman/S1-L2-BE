package Es2;

import java.util.Scanner;

public class Es2 {

    // es2 switch
    public static void switchNumero(int numero) {
        switch (numero) {
            case 0:

                System.out.println("Zero");
                break;
            case 1:

                System.out.println("Uno");
                break;
            case 2:

                System.out.println("Due");
                break;
            case 3:

                System.out.println("Tre");
                break;
            default:

                System.err.println("Error: Number not valid");
        }

    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero da 0 a 3: ");
        int numero = scanner.nextInt();

        switchNumero(numero);

        scanner.close();
    }
}