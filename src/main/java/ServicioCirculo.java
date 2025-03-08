/**
 * Servicio para calcular el perímetro de un círculo.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */

// Importación de la clase Scanner para la entrada de datos desde el usuario
import java.util.Scanner;

public class ServicioCirculo {
    /**
     * Calcula el perímetro de un círculo dado su radio.
     *
     * @param r el radio del círculo
     * @return el perímetro del círculo
     * @throws IllegalArgumentException si el radio es negativo
     */
    public static double perimetroCirculo(double r) {
        // Verifica que el radio no sea negativo, lanza una excepción si lo es
        if (r < 0) throw new IllegalArgumentException("El radio no puede ser negativo");
        // Calcula y devuelve el perímetro del círculo usando la fórmula 2 * π * r
        return 2 * Math.PI * r;
    }

    /**
     * Método principal que permite al usuario ingresar el radio y obtener el perímetro.
     *
     * Se encarga de validar la entrada del usuario para asegurar que solo se ingresen números.
     */
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        double r = -1; // Inicializa el radio con un valor inválido

        while (true) { // Bucle infinito hasta que el usuario ingrese un valor válido
            System.out.print("Ingrese el radio del círculo: "); // Solicita al usuario que ingrese el radio
            if (scanner.hasNextDouble()) { // Verifica si la entrada es un número válido
                r = scanner.nextDouble(); // Captura el valor ingresado
                break; // Sale del ciclo
            } else {
                System.out.println("Error: Debe ingresar un número válido."); // Mensaje de error si la entrada no es válida
                scanner.next(); // Limpia la entrada inválida
            }
        }

        try {
            double perimetro = perimetroCirculo(r); // Llama al método para calcular el perímetro
            System.out.println("El perímetro del círculo es: " + perimetro); // Muestra el resultado
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Muestra el mensaje de error si el radio es negativo
        }

        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}