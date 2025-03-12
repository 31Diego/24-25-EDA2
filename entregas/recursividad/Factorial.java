package entregas.recursividad;

public class Factorial {

    public static int factorial(int numero) {
        if (numero == 0) {
            return 1;
        }

        
        int resultado = numero * factorial(numero - 1);
        System.out.println(resultado);
        return resultado;

    }

    public static void main(String[] args) {
        factorial(5);

    }

}
