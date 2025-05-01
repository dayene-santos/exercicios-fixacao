package TiposPrimitivosOperadores.teste;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Qual é o tipo de cliente? (COMUM ou VIP)");
    String tipoDeCliente = sc.nextLine();

    System.out.println("Possui código de desconto? (true ou false)");
    boolean codigoDesconto  = sc.nextBoolean();

    if(tipoDeCliente.equalsIgnoreCase("VIP")|| codigoDesconto == true) {
        System.out.println("Aplicar desconto ao final da compra!");
    } else {
        System.out.println("Desconto não se aplica a essa compra");
    }

    sc.close();
    }
}
