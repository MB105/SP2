import java.util.ArrayList;
public class FleetOfCars {

    ArrayList<Car> cars = new ArrayList();

    public void addCars(Car car) {
        cars.add(car);


    }

    @Override
    public String toString() {
        StringBuilder fleetOfCars= new StringBuilder("Fleet of Cars:\n");

        for (Car car : cars) {
            fleetOfCars.append(car.toString()+"\n");

        }
        return fleetOfCars.toString();

    }


    public float getTotalRegistrationFeeForFleet() {
        float TotalRegistrationFee=0;
        for (Car car : cars) {
            TotalRegistrationFee += car.getRegistrationFee();

        }
            return TotalRegistrationFee;

        }



    }

