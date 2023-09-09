import java.util.ArrayList;
import java.util.Scanner;

public class Histograma {
    public static void main(String[] args) {
        // Lista para guardar los números
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Contador de números positivos
        int posiNumeros = 0;

        // Contador de números negativos
        int negaNumeros = 0;

        Scanner input = new Scanner(System.in);

        // Bucle para ingresar números hasta que se ingrese 0
        while (true) {
            System.out.print("Ingrese un número: ");
            int numero = input.nextInt();

            if (numero == 0) {
                break; // Salir del bucle si se ingresa 0
            }

            // Agregar números a la lista
            listaNumeros.add(numero);
        }

        // Contar números positivos y negativos en la lista
        for (int numero : listaNumeros) {
            if (numero < 0) {
                negaNumeros++;
            } else {
                posiNumeros++;
            }
        }

        // Crear cadenas de asteriscos para representar la cantidad de números positivos y negativos
        String posiAsteriscos = "*".repeat(posiNumeros);
        String negaAsteriscos = "*".repeat(negaNumeros);

        // Imprimir los resultados
        System.out.println("Positivos: " + posiAsteriscos);
        System.out.println("Negativos: " + negaAsteriscos);
    }
}