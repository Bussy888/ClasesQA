package mockExample2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class PremioCalculatorTest {

    Service serviceMock = Mockito.mock(Service.class);

    @Test
    public void testPremioEdadMenorIgual10NumeroPrimo() {
        when(serviceMock.isPrime(2)).thenReturn(true);

        PremioCalculator premioCalculator = new PremioCalculator(serviceMock);
        int premio = premioCalculator.getPremio(2);

        assertEquals(200, premio);
    }

    @Test
    public void testPremioEdadMenorIgual10NumeroNoPrimo() {
        when(serviceMock.isPrime(3)).thenReturn(false);

        PremioCalculator premioCalculator = new PremioCalculator(serviceMock);
        int premio = premioCalculator.getPremio(3);

        assertEquals(3, premio);
    }

    @Test
    public void testPremioEdadMayor10NumeroPrimo() {
        when(serviceMock.isPrime(13)).thenReturn(true);

        PremioCalculator premioCalculator = new PremioCalculator(serviceMock);
        int premio = premioCalculator.getPremio(13);

        assertEquals(1040, premio);
    }

    @Test
    public void testPremioEdadMayor10NumeroNoPrimo() {
        when(serviceMock.isPrime(15)).thenReturn(false);

        PremioCalculator premioCalculator = new PremioCalculator(serviceMock);
        int premio = premioCalculator.getPremio(15);

        assertEquals(0, premio);
    }
}