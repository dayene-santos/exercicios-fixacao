package EstruturasDeControle.teste;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade <18){
            System.out.println("Você ainda é menor de idade");
        } else {
            System.out.println("Você já é maior de idade");
        }

        sc.close();
    }
}
