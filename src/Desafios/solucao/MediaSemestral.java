package Desafios.solucao;

import java.util.Scanner;

public class MediaSemestral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas Disciplinas você está cursando? ");
        int quantidadeDisciplinas = sc.nextInt(); // define a quantidade de matérias cursadas

        String[] disciplinas = new String[quantidadeDisciplinas]; // armazena as disciplinas
        double nota1 = 0, nota2 = 0, media = 0; // iniciando as variáveis para não haver erros

        sc.nextLine(); // consumir a quebra de linha
        // recebe as disciplinas definida pelo usuário
        for (int i = 0; i < quantidadeDisciplinas; i++) {
            System.out.print("Disciplina: ");
            disciplinas[i] = sc.nextLine();
        }
        // percorre as disciplinas, recebe as notas de cada uma e calcula suas respectivas médias
        for (int i = 0; i < disciplinas.length; i++) {
            System.out.print("Nota 1 de " + disciplinas[i] + ": ");
            nota1 = sc.nextDouble();
            System.out.print("Nota 2 de " + disciplinas[i] + ": ");
            nota2 = sc.nextDouble();
            media = (nota1 + nota2) / 2;
            // verifica se o aluno está aprovado ou não
            if (media >= 6) {
                System.out.println("Disciplina: " + disciplinas[i] + " - Parabéns, você está Aprovado! Sua média final: " + media);
            } else {
                System.out.println("Disciplina: " + disciplinas[i] + " - Você está Reprovado! Sua média final: " + media);
            }
        }
        sc.close();
    }
}
