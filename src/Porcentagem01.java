import java.util.Scanner;


public class Porcentagem01 {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        float saldo;
        float taxaDeReajuste= 1;

        System.out.println("Digite saldo: ");
        saldo = entrada.nextFloat();
        System.out.println("Saldo e : " + saldo);

        float valorAReajustar;
        valorAReajustar= saldo * taxaDeReajuste;

        System.out.println("o valor a reajustar e = " + saldo * taxaDeReajuste / 100);
        System.out.println("o novo valor e = " + (saldo + (valorAReajustar / 100)));


    }


}

