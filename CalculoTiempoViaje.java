import java.util.Scanner;

public class CalculoTiempoViaje {
    public static void main(String[] args) {
        int tiempoTotal = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese la duración del tramo en minutos (0 para finalizar): ");
            int tiempoTramo = scanner.nextInt();

            if (tiempoTramo == 0) {
                break;  // Salir del bucle si se ingresa 0.
            }

            tiempoTotal += tiempoTramo; //sumar todos los tiempos dados.
        }

        // Calcular las horas y minutos totales.
        int horas = tiempoTotal / 60;
        int minutos = tiempoTotal % 60;

        System.out.printf("El tiempo total de viaje es de: "+horas+" y "+minutos+" minutos");
    }
}
