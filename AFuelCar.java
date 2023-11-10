public abstract class AFuelCar extends ACar {

   public int kmPerLitre;




    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors,int kmPerLitre) {
        super(registrationNumber, make, model,numberOfDoors);
        this.kmPerLitre =kmPerLitre;
    }

    public abstract String getFuelType();

    public abstract int getKmPerLitre();



    @Override
    public String toString(){
        return "Registration number:" + getRegistrationNumber() + "make:" + getMake() + "model:" + getModel()
                + "number of doors:" + getNumberOfDoors() + "km per litre:" + getKmPerLitre();
    }
}

