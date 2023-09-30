package ejercicioUnitTest2;

public class Banco {
    private ASFIService asfiService;

    public Banco(ASFIService asfiService) {
        this.asfiService = asfiService;
    }

    public int getMaximoPrestamo(String ci) {
        String categoria = getCategoria(ci);
        switch (categoria) {
            case "A":
                return 200000;
            case "B":
                return 100000;
            case "C":
                return 0;
            default:
                throw new IllegalArgumentException("Categoría desconocida");
        }
    }

    public String getCategoria(String ci) {
        // Llamar al servicio ASFI para obtener la categoría
        // Aquí se simula una llamada al servicio en la implementación real
        return asfiService.obtenerCategoria(ci);
    }
}
