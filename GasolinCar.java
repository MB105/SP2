public class GasolinCar extends AFuelCar {
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
    }

    public float getRegistrationFee() {

        if (kmPerLitre > 20 && kmPerLitre < 50) {
            return 330;
        } else if (kmPerLitre > 15 && kmPerLitre < 20) {
            return 1050;
        } else if (kmPerLitre > 10 && kmPerLitre < 15) {
            return 2340;
        } else if (kmPerLitre > 5 && kmPerLitre < 10) {
            return 5500;
        } else if (kmPerLitre < 5) {
            return 10470;
        } else {

            return 0;

        }
    }

        @Override
        public String getFuelType() {
            return "Gasoline";

        }
        public int getKmPerLitre () {
            return kmPerLitre;
        }

    }





