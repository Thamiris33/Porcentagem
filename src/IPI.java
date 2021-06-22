import java.util.Scanner;

public class IPI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int codigoDaPeca1;
        float valorDaPeca1;
        int quantidade1;


        System.out.println("Digite codigo da peca 1: ");
        codigoDaPeca1 = entrada.nextInt();
        System.out.println("Digite valor 1: ");
        valorDaPeca1 = entrada.nextFloat();
        System.out.println("Digite quantidade 1: ");
        quantidade1 = entrada.nextInt();

        int codigoDaPeca2;
        float valorDaPeca2;
        int quantidade2;

        System.out.println("Digite codigo da peca 2: ");
        codigoDaPeca2 = entrada.nextInt();
        System.out.println("Digite valor 2: ");
        valorDaPeca2 = entrada.nextFloat();
        System.out.println("Digite quantidade 2: ");
        quantidade2 = entrada.nextInt();

        float IPI;
        System.out.println("Digite valor IPI: ");
        IPI = entrada.nextFloat();
        System.out.println("O valor do IPI e = " + IPI);

        float valorFinal;
        valorFinal = ((valorDaPeca1 * quantidade1) + (valorDaPeca2 * quantidade2) * (IPI / 100 + 1));
        System.out.println("O valor do Total das pecas e = " + valorFinal);
    }
}
