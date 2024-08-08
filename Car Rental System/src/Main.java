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

class Rental{
    private Car car;
    private Customer customer;
    private int days;

    public Rental(Car car,Customer customer,int days){
        this.car = car;
        this.customer = customer;
        this.days = days;
    }

    public Car getCar(){
        return car;
    }

    public Customer getCustomer(){
        return customer;
    }

    public int getDays(){
        return days;
    }


}

class CarRentalSystem{

    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem(){
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void rentCar(Car car,Customer customer,int days){
        if (car.isAvailable()) {
            car.rent();
            rentals.add(new Rental(car,customer,days));
        } else {
            System.out.println("Car is not available for rent");
        }
    }

    public void returnCar(Car car){
        Rental rentalToRemove = null;
        for(Rental rental:rentals){
            if (rental.getCar() == car) {
                rentalToRemove = rental;
                break;
            }

        }
        if (rentalToRemove != null) {
            rentals.remove(rentalToRemove);
            car.returnCar();
            System.out.println("Car returned successfully !");
        } else {
            System.out.println("car was not rented");
        }

    }

    public void menue(){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Car Rental System =====");
            System.out.println("1.Rent a car");
            System.out.println("2.Return a car");
            System.out.println("3.Exit");
            System.out.println("=============================");
            System.out.println("Enter Your Choice");

            int choice = scanner.nextInt();
            scanner.nextLine(); //consumes new line 
        }
    }

    public class Main {
    
        public static void main(String[] args) {
            
        }
    }
}