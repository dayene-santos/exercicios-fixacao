package TiposPrimitivosOperadores.teste;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 1234;
        System.out.println("Digite a senha: ");
        int tentativaSenha = sc.nextInt();

        boolean senhaIgual = (senha == tentativaSenha);
        boolean senhaDiferente = (senha != tentativaSenha);

        System.out.println("Senha Válida? " + senhaIgual);

        sc.close();
    }
}
