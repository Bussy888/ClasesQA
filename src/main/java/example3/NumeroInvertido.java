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
    public static String invertir2(int numero) {
        int invertido = 0;
        while (numero != 0) {
            int digito = numero % 10;
            invertido = (invertido * 10) + digito;
            numero /= 10;
        }
        if (invertido%2 == 1){
            invertido=invertido+10;
        }

        return invertido+"";
    }

    // sin bugs
    public static String invertirNumero(int numero) {
        StringBuilder resultado = new StringBuilder();
        String numeroString = String.valueOf(numero);

        for (int i = numeroString.length() - 1; i >= 0; i--) {
            resultado.append(numeroString.charAt(i));
        }

        return resultado.toString();
    }
}
