package example1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorParamTest {

    @ParameterizedTest
    @CsvSource(
            {
                    "2,2,4",
                    "3,3,6",
                    "0,1,1",
                    "-1,5,4",
                    "500, -100, 400"
            }
    )
    public void verifyAdditionPares(int nA, int nB, int expectedResult){
        Calculator calculator = new Calculator();
        int actualResult = calculator.add(nA,nB);

        Assertions.assertEquals(expectedResult,actualResult, "ERROR! la suma es incorrecta");
    }
}
