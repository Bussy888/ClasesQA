package ejercicioUnitTest1;

public class PalindromeChecker {
        public boolean isPalindrome(String word) {
            // Elimina espacios en blanco y convierte a minúsculas
            word = word.replaceAll("\\s+", "").toLowerCase();

            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

            return true;
        }
}
