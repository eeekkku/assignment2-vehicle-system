public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    public Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    // Abstract methods to be implemented by subclasses
    public abstract void startEngine();
    public abstract void stopEngine();

    // Concrete method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
        if (driver != null){
            driver.displayDriverInfo();
        } else{
            System.out.println("no driver assigned");
        }

    }

}
