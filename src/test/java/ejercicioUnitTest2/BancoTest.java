package ejercicioUnitTest2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BancoTest {

    @Mock
    private ASFIService asfiService;

    private Banco banco;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this); // Inicializar los mocks

        // Crear la instancia de Banco con el mock del servicio ASFI
        banco = new Banco(asfiService);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaA() {
        // Configurar el comportamiento del mock para devolver "A" como categoría
        Mockito.when(asfiService.obtenerCategoria("454566")).thenReturn("A");

        int resultado = banco.getMaximoPrestamo("454566");
        Assertions.assertEquals(200000, resultado);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaB() {
        // Configurar el comportamiento del mock para devolver "B" como categoría
        Mockito.when(asfiService.obtenerCategoria("999999")).thenReturn("B");

        int resultado = banco.getMaximoPrestamo("999999");
        Assertions.assertEquals(100000, resultado);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaC() {
        // Configurar el comportamiento del mock para devolver "C" como categoría
        Mockito.when(asfiService.obtenerCategoria("77777")).thenReturn("C");

        int resultado = banco.getMaximoPrestamo("77777");
        Assertions.assertEquals(0, resultado);
    }

    @Test
    public void testGetMaximoPrestamoCategoriaDesconocida() {
        // Configurar el comportamiento del mock para devolver una categoría desconocida
        Mockito.when(asfiService.obtenerCategoria("12345")).thenReturn("D");

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            banco.getMaximoPrestamo("12345");
        });
    }
}