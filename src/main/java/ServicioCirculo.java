/**
 * Servicio para calcular el área de un círculo.
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */

// Importación de la clase Scanner para la entrada de datos desde el usuario
import java.util.Scanner;

public class ServicioCirculo {
    /**
     * Calcula el área de un círculo dado su radio.
     *
     * @param r el radio del círculo
     * @return el área del círculo
     * @throws IllegalArgumentException si el radio es negativo
     */
    public static double areaCirculo(double r) {
        // Verifica que el radio no sea negativo, lanza una excepción si lo es
        if (r < 0) throw new IllegalArgumentException("El radio no puede ser negativo");
        // Calcula y devuelve el área del círculo usando la fórmula π * r²
        return Math.PI * r * r;
    }

    /**
     * Método principal que permite al usuario ingresar el radio y obtener el área.
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
                break; // Sale del bucle
            } else {
                System.out.println("Error: Debe ingresar un número válido."); // Mensaje de error si la entrada no es válida
                scanner.next(); // Limpia la entrada inválida
            }
        }

        try {
            double area = areaCirculo(r); // Llama al método para calcular el área
            System.out.println("El área del círculo es: " + area); // Muestra el resultado
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Muestra el mensaje de error si el radio es negativo
        }

        scanner.close(); // Cierra el objeto Scanner para liberar recursos
    }
}