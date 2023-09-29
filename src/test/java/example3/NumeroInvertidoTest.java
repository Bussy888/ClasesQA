package example3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NumeroInvertidoTest {
    @ParameterizedTest
    @CsvSource({
            "123, '321'",
            "100, '001'",
            "8, '8'",
            "80, '08'",
            "1232198, '8912321'",
            "-5, 'Valor Incorrecto'"
    })
    public void testInvertir(int input, String expectedOutput) {
        NumeroInvertido numeroInvertido = new NumeroInvertido();
        String actualOutput = numeroInvertido.invertir(input);
        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
