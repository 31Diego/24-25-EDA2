package entregas.recursividad;

import java.util.Scanner;

class CuentaAtras {

    public static int contador(int numero, Scanner scanner) {
        if (numero < 0) {
            return 0;
        }

        System.out.println(numero);
        scanner.nextLine();
        int resultado = contador(numero - 1, scanner);
        return resultado;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        contador(5, scanner);
        scanner.close();

    }
}