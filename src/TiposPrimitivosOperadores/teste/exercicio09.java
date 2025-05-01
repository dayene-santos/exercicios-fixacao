package TiposPrimitivosOperadores.teste;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        int curtidas = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 'c' para curtir ou 's' para sair:");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("c")) {
                curtidas += 1;
                System.out.println("Curtidas: " + curtidas);
            } else if (entrada.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Total de curtidas: " + curtidas);
        scanner.close();
    }
}