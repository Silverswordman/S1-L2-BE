package Es3;

import java.util.Scanner;

public class Es3 {




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci una stringa (:q per uscire):");
            String word = scanner.nextLine();

            if (":q".equals(word)) {
                System.out.println("Comando di uscita");
                break;
            }

            System.out.println("Caratteri separati dalla virgola:");

            for (int i = 0; i < word.length(); i++) {
                System.out.print(word.charAt(i));

                if (i < word.length() - 1) {
                    System.out.print(",");
                }
            }

            System.out.println();
        }

        scanner.close();
    }

}
