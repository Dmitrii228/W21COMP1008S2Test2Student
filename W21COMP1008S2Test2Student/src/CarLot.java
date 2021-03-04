import java.util.ArrayList;

/**
 * Name: Dmitrii Demin
 * Student number: 200464709
 */
public class CarLot {
    private ArrayList<Car> cars;

    public CarLot(){
        cars = new ArrayList<>();
    }

    public void addCar(Car car)
    {
        cars.add(car);
    }

    public double getInventoryValue()
    {
        double total = 0;
        for (int i = 0; i < cars.size(); i++) {
            total += cars.get(i).getPrice();
        }

        return total;
    }
    public ArrayList<Car> getCarsByBrandFord(String manufacturer){
       return null;

    }
    public ArrayList<Car> getCarsByBrand(String manufacturer)
    {
        //if (manufacturer.equals("Ford"))
       return getCarsByBrandFord("Ford");

    }

    public ArrayList<Car> getCarsByModel(String model)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowPrice(double maxPrice)
    {
        return null;
    }

    public ArrayList<Car> getCarsBelowMileage(double maxkm)
    {
        return null;
    }

    public int getNumOfCarsUnderPrice(double maxPrice)
    {
        return -1;
    }

    public double getAvgPrice()
    {
        double total = 0;
        double avgPrice = 0;
        for (int i = 0; i < cars.size(); i++) {
            total += cars.get(i).getPrice();
        }
        avgPrice = total/cars.size();
        return avgPrice;
    }

    public int getNumOfCarsInInventory()
    {
        return cars.size();
    }

    public String toString()
    {
        return "";
    }
}
