import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = lector.nextInt();

        // Se convierte la variable entera a string
        String num = Integer.toString(numero);

        /*Se usa la función StringBuilder que permite modificar cadenas y se invierte la variable num */
        StringBuilder lista =  new StringBuilder(num);
        lista.reverse();

        /*Se convierte de el valor obtenido de la funcion reverse a String */
        String inverso = lista.toString();

        // Comparamos la cadena original con la invertida
        if(num.equals(inverso)){
            System.out.println("El numero es palindromo");
        } else {
            System.out.println("El numero NO es palindromo");
        }
    }
}