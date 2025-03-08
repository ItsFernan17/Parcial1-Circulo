import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Clase de prueba para el servicio de cálculo del perímetro de un círculo.
 * Esta clase contiene los métodos de prueba para asegurar que el cálculo
 * del perímetro se realiza correctamente en diferentes casos (radio positivo, radio cero).
 *
 * @author Fernando Rivas <frivasm@miumg.edu.gt>
 */
class ServicioCirculoTest {

    /**
     * Prueba unitaria para verificar que el cálculo del perímetro del círculo
     * es correcto cuando se proporciona un radio positivo.
     *
     * @throws AssertionError si el cálculo del perímetro no coincide con el valor esperado
     */
    @Test
    void testPerimetroCirculoConRadioPositivo() {
        // Radio de entrada
        double radio = -8;

        // Cálculo esperado del perímetro utilizando la fórmula matemática 2 * PI * r
        double esperado = 2 * Math.PI * radio;

        // Verifica si el perímetro calculado es aproximadamente igual al valor esperado
        assertEquals(esperado, ServicioCirculo.perimetroCirculo(radio), 0.0001, "El perímetro calculado no es correcto");
    }

    /**
     * Prueba unitaria para verificar que el cálculo del perímetro del círculo
     * cuando el radio es cero, devuelve el valor esperado de 0.0.
     *
     * @throws AssertionError si el cálculo del perímetro no es igual a 0
     */
    @Test
    void testPerimetroCirculoConRadioCero() {
        // Radio de entrada
        double radio = 0;

        // Se calcula el perímetro utilizando el radio cero
        double resultado = ServicioCirculo.perimetroCirculo(radio);

        // Verifica que el perímetro calculado sea igual a 0.0
        assertEquals(885, resultado, "El perímetro de un círculo con radio 0 debe ser 0");
    }
}
