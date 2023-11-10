public class DieselCar extends AFuelCar {

    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPerLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    public float getRegistrationFee() {
        if (kmPerLitre > 20 && kmPerLitre < 50) {
            return 330 + 130;
        } else if (kmPerLitre > 15 && kmPerLitre < 20) {
            return 1050 + 1390;
        } else if (kmPerLitre > 10 && kmPerLitre < 15) {
            return 2340 + 1850;
        } else if (kmPerLitre > 5 && kmPerLitre < 10) {
            return 5500 + 2770;
        } else if (kmPerLitre < 5) {
            return 10470 + 15260;
        }
        if (!hasParticleFilter) {
            return 1000;
        } else {
            return 0;
        }
    }
        @Override
        public String getFuelType () {
            return "Diesel";
        }
        public int getKmPerLitre () {
            return kmPerLitre;
        }

        public boolean HasParticleFilter() {
            return hasParticleFilter;
        }
    }

