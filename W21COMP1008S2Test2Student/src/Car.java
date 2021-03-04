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
    public static List<String> getFordModels(){
        return  Arrays.asList("F150", "Escort","Explorer");
    }
    public void setModel(String model) {
        List<String> fordModel = Arrays.asList("F150", "Escort", "Explorer");
        List<String> hondaModel = Arrays.asList("Accord", "Civic","Pilot");
        List<String> porscheModel = Arrays.asList("911", "Cayman","718 Boxster");


        if(make.equals("Ford")){
            if(fordModel.contains(model)){
                this.model = model;
            }
            else
                throw new IllegalArgumentException("Model is invalid!!!");
        }
        else if (make.equals("Honda")){
            if(hondaModel.contains(model)){
                this.model = model;
            }
            else
                throw new IllegalArgumentException("Model is invalid!!!");
        }
        else if (make.equals("Porsche")){
            if(porscheModel.contains(model)){
                this.model = model;
            }
            else
                throw new IllegalArgumentException("Model is invalid!!!");
        }

    }

    public void setMileage(int mileage) {
        if (mileage>=0&&mileage<=5000000){
            this.mileage=mileage;
        }
        else
            throw new IllegalArgumentException(mileage+" is not a valid mileage, should be between 0 and 5,000,000");
    }

    public void setPrice(double price) {
        if (price>=0 && price<=2000000){
            this.price = price;
        }
        else
            throw new IllegalArgumentException(price+" is not a valid price, should be between 0 and 2,000,000");
    }

    public String toString()
    {
        return String.format("%1s %2s, with %3s km - asking $%4s", make, model,mileage,price);
    }
}
