import java.util.Scanner;

public class Caballo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita las coordenadas del caballo al usuario.
        System.out.print("Ingrese la fila del caballo (1-8): ");
        int fila = sc.nextInt();
        System.out.print("Ingrese la columna del caballo (1-8): ");
        int columna = sc.nextInt();

        // Verifica si las coordenadas son válidas (entre 1 y 8).
        if (fila < 1 || fila > 8 || columna < 1 || columna > 8) {
            System.out.println("Coordenadas inválidas. Deben estar entre 1 y 8.");
        } else {
            // Calcula y muestra las casillas a las que el caballo puede saltar.
            System.out.println("El caballo puede saltar de " + fila + ", " + columna + " a:");

            // Definimos los movimientos posibles del caballo en forma de L.
            int[][] movimientos = {
                    {-2, -1}, {-2, 1},
                    {-1, -2}, {-1, 2},
                    {1, -2}, {1, 2},
                    {2, -1}, {2, 1}
            };

            // Iteramos a través de los movimientos posibles.
            for (int i = 0; i < movimientos.length; i++) {
                int nuevaFila = fila + movimientos[i][0];
                int nuevaColumna = columna + movimientos[i][1];

                // Verifica si la nueva posición está dentro del tablero.
                if (nuevaFila >= 1 && nuevaFila <= 8 && nuevaColumna >= 1 && nuevaColumna <= 8) {
                    System.out.println(nuevaColumna + ", " + nuevaFila);
                }
            }
        }
    }
}