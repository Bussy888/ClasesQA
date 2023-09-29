package example3;

public class NumeroInvertido {
    public String invertir(int numero) {
        if (numero < 0) {
            return "Valor Incorrecto";
        } else {
            String cadena = String.valueOf(numero);
            if (cadena.length() == 1) {
                return cadena;
            } else {
                StringBuilder invertido = new StringBuilder();
                for (int i = cadena.length() - 1; i >= 0; i--) {
                    invertido.append(cadena.charAt(i));
                }
                return invertido.toString();
            }
        }
    }
}
