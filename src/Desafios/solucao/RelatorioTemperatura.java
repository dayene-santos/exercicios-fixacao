package Desafios.solucao;

import java.util.Scanner;

public class RelatorioTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] diaDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" }; // definindo os dias da semana
        double[] temperatura = new double[7]; // iniciando o array e definindo as posições
        double soma = 0, media;
        // loop para receber as temperaturas respectivas a cada dia da semana
        for (int i = 0; i < diaDaSemana.length; i++) {
            System.out.printf("Digite a temperatura de %s: ", diaDaSemana[i]);
            temperatura[i] = sc.nextDouble();
        }
        // Percorrendo todos os dias da semana e coletando a temperatura para cada um
        for (int i = 0; i < diaDaSemana.length; i++) {
            soma = soma + temperatura[i]; // acessa cada temperatura corretamente
        }
        // calculo da media semanal
        media = soma / diaDaSemana.length;
        System.out.printf("\nMédia de temperatura semanal: %.2fºC\n", media);
        // análise dos dias que tiveram temperatura acima da média
        System.out.println("\nDias com temperatura acima da média: ");
        for (int i = 0; i < diaDaSemana.length; i++) {
            if (temperatura[i] > media) {
                System.out.println(diaDaSemana[i] + " teve temperatura acima da média: " + temperatura[i] + "ºC");
            }
        }
    }
}
