import java.util.Scanner;

public class Contar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("parametro um");
        int parametroUm = scanner.nextInt();
        System.out.println("parametro dois");

        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametroInvalido erro) {
            System.out.println("parametro um maior que o dois");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalido {
        if (parametroUm >= parametroDois) {
            throw new ParametroInvalido();
        } else {
            for (int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("O numero que está imprimindo é: " + i);
            }
        }
    }
}
