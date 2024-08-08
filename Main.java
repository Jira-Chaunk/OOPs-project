import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class Car{
    private String carId;
    private String model;
    private String brand;
    private double basePrice;
    private boolean isAvailable;

    public Car(String carId,String model,String brand,double basePrice){
        this.basePrice = basePrice;
        this.brand = brand;
        this.carId = carId;
        this.isAvailable = true;
        this.model = model;
    }

    

}