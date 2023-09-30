package mockexample1;
import mocksExample1.CalcultorAdvanced;
import mocksExample1.ServiceCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorAdvancedTest {
    // PASO 2
    // necesitamos crear el objecto falso usando  Mockito.mock(tipo de la clases)

    ServiceCalc serviceCalcMock = Mockito.mock(ServiceCalc.class);

    @Test
    public void verifyFactorial(){
        // PASO 3 > le decimos al metodo que queremos que retorne
        Mockito.when(serviceCalcMock.mul(1,1)).thenReturn(1);
        Mockito.when(serviceCalcMock.mul(1,2)).thenReturn(2);
        Mockito.when(serviceCalcMock.mul(2,3)).thenReturn(6);
        // PASO 4 > usar el objeto mockeado

        CalcultorAdvanced calculatorAdvanced = new CalcultorAdvanced();
        calculatorAdvanced.setCalcService(serviceCalcMock);
        int actual = calculatorAdvanced.getFactorial(4);
        int expected = 24;
        Assertions.assertEquals(expected,actual,"ERROR> el factorial es incorrecto");

    }

}
