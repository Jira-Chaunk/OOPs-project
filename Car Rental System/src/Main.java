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

    public String getCarId(){
        return carId;
    }

    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }

    public double calculatePrice(int rentalDays){
        return rentalDays * basePrice;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rent(){
        isAvailable = false;
    }

    public void returnCar(){
        isAvailable = true;
    }


}

class Customer{
    private String customerId;
    private String customerName;

    public Customer(String customerId,String customerName){
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId(){
        return customerId;
    }

    public String getCustomerName(){
        return customerName;
    }

    
}