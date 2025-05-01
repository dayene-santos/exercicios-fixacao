package TiposPrimitivosOperadores.teste;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Você aceita os termos de uso para obter acesso?");
        boolean termosDeUso = sc.nextBoolean();

        if (idade >= 18 && termosDeUso == true) {
            System.out.println("Você tem os requisitos necessários para ter o acesso liberado!");
        } else if (idade <18)  {
            System.out.println("Você não tem a idade minima estabelecida para obter o acesso");
        } else {
            System.out.println("Você não aceitou os termos de uso para obter acesso");
        }

        sc.close();
    }
}
