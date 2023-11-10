public class ElectricCar extends ACar {

    float batteryKWh;
    float maxRangeKm;

    float whPrKm;


    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors,float batteryKWh,float maxRangeKm){
        super(registrationNumber, make, model,numberOfDoors);
    this.batteryKWh=batteryKWh;
    this.maxRangeKm=maxRangeKm;
    this.whPrKm=getWhPrKm();

    }
    public float getRegistrationFee() {
        float kmPerLitre = (float) (100 / (whPrKm / 91.25));

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

    public float getBatteryCapacityKWh(){
        return batteryKWh;
    }

    public float getMaxRangeKm(){
        return maxRangeKm;
    }

    public float getWhPrKm(){
        float whPrKm=batteryKWh/maxRangeKm;
        return whPrKm;
    }

}
