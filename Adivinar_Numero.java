import java.util.Scanner;
// Importamos la biblioteca "random" para generar números aleatorios.
import java.util.Random;

public class Adivinar_Numero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Crear un objeto Random para generar un número aleatorio entre 1 y 100.
        Random random = new Random();
        int aleatorio = random.nextInt(100) + 1;

        // Inicializar una variable para llevar un registro de los intentos del usuario.
        int intentos = 0;

        // Iniciar un bucle que se ejecutará indefinidamente hasta que el usuario adivine el número.
        while(true){

            // Solicitar al usuario que ingrese un número y almacenarlo en "numero_usuario".
            System.out.print("ADIVINA EL NÚMERO: ");
            int numero_usuario = sc.nextInt();

            // Comparar el número ingresado por el usuario con el número aleatorio generado.
            if(numero_usuario < aleatorio){
                // Si el número ingresado por el usuario es menor, mostrar un mensaje y aumentar el contador de intentos.
                intentos += 1;
                System.out.println("El número aleatorio es mayor que "+numero_usuario+"\nIntento #"+intentos);
            }
            else if(numero_usuario > aleatorio){
                // Si el número ingresado por el usuario es mayor, mostrar un mensaje y aumentar el contador de intentos.
                intentos += 1;
                System.out.println("El número aleatorio es menor que "+numero_usuario+"\nIntento #"+intentos);
            }
            else{
                // Si el usuario adivina el número, mostrar un mensaje y el número de intentos.
                intentos += 1;
                System.out.println("LO HALLASTE \nEl número es "+numero_usuario+"\nAdivinaste en "+intentos+" intentos");

                // Salir del bucle.
                break;
            }
        }
    }
}