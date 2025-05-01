package TiposPrimitivosOperadores.teste;

public class exercicio02 {
    public static void main(String[] args) {

        // Usando o tipo 'byte' (1 byte) para armazenar um número pequeno.
        // O valor máximo que o tipo 'byte' pode armazenar é 127, então é suficiente para valores pequenos.
        byte numeroDeDias = 127; // Dias de operação de máquinas, que podem ser um número pequeno
        System.out.printf("Número de dias de operação: %d (tipo byte, 1 byte de memória)%n", numeroDeDias);

        // Usando o tipo 'int' (4 bytes) para um número maior, como a contagem de itens em um inventário.
        // Se o número de itens for maior que o valor máximo de um 'byte', então usamos 'int'.
        int quantidadeDeItens = 5000; // Exemplo de um número maior, que excede o limite do 'byte'
        System.out.printf("Quantidade de itens no inventário: %d (tipo int, 4 bytes de memória)%n", quantidadeDeItens);

        // Usando o tipo 'boolean' (1 byte) para representar uma condição de controle.
        // O tipo 'boolean' é ideal para condições de verdadeiro ou falso.
        boolean sistemaAtivo = true; // Variável que indica se o sistema está ativo
        System.out.printf("Sistema está ativo? %b (tipo boolean, 1 byte de memória)%n", sistemaAtivo);

        // Usando o tipo 'long' (8 bytes) para armazenar um valor grande, como a contagem de visitas em um site.
        // Quando precisamos de um intervalo maior, usamos o tipo 'long'.
        long contagemDeVisitas = 1500000000L; // Número muito grande, então usamos 'long'
        System.out.printf("Contagem de visitas no site: %d (tipo long, 8 bytes de memória)%n", contagemDeVisitas);

        // Usando o tipo 'double' (8 bytes) para armazenar um número de ponto flutuante com alta precisão.
        // O 'double' é usado quando precisamos de mais precisão em cálculos matemáticos.
        double precoProduto = 299.99; // Preço de um produto, com duas casas decimais
        System.out.printf("Preço do produto: %.2f (tipo double, 8 bytes de memória)%n", precoProduto);

        // Usando o tipo 'char' (2 bytes) para armazenar um caractere único.
        // O tipo 'char' armazena caracteres Unicode.
        char letraInicial = 'A'; // Primeira letra do alfabeto
        System.out.printf("Letra inicial do produto: %c (tipo char, 2 bytes de memória)%n", letraInicial);

    }
}

