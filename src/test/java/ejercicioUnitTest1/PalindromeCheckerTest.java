package ejercicioUnitTest1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PalindromeCheckerTest {
    @ParameterizedTest
    @CsvSource({
            "jose , false",
            "oro , true",
            "reconocer , true",
            "casa , false",
            "Aba , true", // Prueba con mayúsculas y minúsculas
            "Anita lava la tina , true"
    })
    public void testIsPalindrome(String word, boolean expected) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        boolean actual = palindromeChecker.isPalindrome(word);
        Assertions.assertEquals(expected, actual, "La palabra '" + word + "' no se evaluo correctamente como palindromo.");
    }
}
