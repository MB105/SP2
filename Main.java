public class Main {

    public static void main(String[]args){

FleetOfCars carFleet= new FleetOfCars();

GasolinCar gasolincar=new GasolinCar("4547323","Chevrolet","Blazer",4,14);

DieselCar dieselcar= new DieselCar("3482421","BMW", "320d",4,18,false);

ElectricCar electriccar=new ElectricCar("3543525","Tesla","X",4,40, 60);

carFleet.addCars(gasolincar);

carFleet.addCars(dieselcar);

carFleet.addCars(electriccar);

        System.out.println(carFleet.toString());

        System.out.println("Total registration fee:" + carFleet.getTotalRegistrationFeeForFleet());

    }
}
