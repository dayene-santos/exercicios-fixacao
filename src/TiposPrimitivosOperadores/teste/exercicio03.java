package TiposPrimitivosOperadores.teste;

public class exercicio03 {
    public static void main(String[] args) {

        // Declaração de uma variável do tipo double
        double valorDouble = 123.456;

        // Casting explícito de double para int
        int valorInt = (int) valorDouble;  // O valor decimal será descartado

        // Exibindo os resultados
        System.out.println("Valor original (double): " + valorDouble);  // 123.456
        System.out.println("Valor convertido (int): " + valorInt);      // 123
    }
}
