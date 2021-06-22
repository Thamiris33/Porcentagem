import java.util.Scanner;

public class SALARIOMINIMO {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float salarioMinimo = 788;
        float salarioUsuario;

        System.out.println("Digite salarioUsuario: ");
        salarioUsuario = entrada.nextFloat();
        System.out.println("salarioUsuario e: " + salarioUsuario);

        float quantidadesalarioUsuario;

        System.out.println("salarioMinimo= " + (salarioMinimo / salarioUsuario));
    }
}
