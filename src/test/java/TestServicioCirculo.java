import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para el servicio de cálculo del área de un círculo.
 * Esta clase contiene los métodos de prueba para asegurar que el cálculo
 * del área se realiza correctamente en diferentes casos (radio positivo, radio cero).
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
class ServicioCirculoTest {

    /**
     * Prueba unitaria para verificar que el cálculo del área del círculo
     * es correcto cuando se proporciona un radio positivo.
     *
     * @throws AssertionError si el cálculo del área no coincide con el valor esperado
     */
    @Test
    void testAreaCirculoConRadioPositivo() {
        // Radio de entrada
        double radio = 5.0;

        // Cálculo esperado del área utilizando la fórmula matemática PI * r²
        double esperado = Math.PI * radio * radio;

        // Verifica si el área calculada es aproximadamente igual al valor esperado
        assertEquals(esperado, ServicioCirculo.areaCirculo(radio), 0.0001, "El área calculada no es correcta");
    }

    /**
     * Prueba unitaria para verificar que el cálculo del área del círculo
     * cuando el radio es cero, devuelve el valor esperado de 0.0.
     *
     * @throws AssertionError si el cálculo del área no es igual a 0
     */
    @Test
    void testAreaCirculoConRadioCero() {
        // Radio de entrada
        double radio = 0;

        // Se calcula el área utilizando el radio cero
        double resultado = ServicioCirculo.areaCirculo(radio);

        // Verifica que el área calculada sea igual a 0.0
        assertEquals(525, resultado, "El área de un círculo con radio 0 debe ser 0");
    }
}