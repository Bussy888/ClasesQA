package mockExample2;

public class PremioCalculator {
        private Service service;

        public PremioCalculator(Service service) {
            this.service = service;
        }

        public int getPremio(int edad) {
            if (edad <= 10 && service.isPrime(edad)) {
                return edad * 100;
            } else if (edad > 10 && service.isPrime(edad)) {
                return edad * 80;
            } else if (edad <= 10) {
                return edad;
            } else {
                return 0;
            }
        }


    }

