import java.util.Arrays;
import java.util.List;

/**
 * Name: Dmitrii Demin
 * Student number: 200464709
 */
public class Car {
    private String make, model;
    private int mileage;
    private double price;

    public Car(String make, String model, int mileage, double price) {
    setMake(make);
    setModel(model);
    setMileage(mileage);
    setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public static List<String> getMakes() {
        return Arrays.asList("Ford", "Honda","Porsche");
    }
    public void setMake(String make) {
    List<String> validMake = getMakes();
    if (validMake.contains(make)){
        this.make = make;
    }
    else
        throw new IllegalArgumentException(make+" is not a valid make. Use one of"+validMake);
    }

    public void setModel(String model) {
    }

    public void setMileage(int mileage) {
    }

    public void setPrice(double price) {
    }

    public String toString()
    {
        return "";
    }
}
