public class eScooter extends Vehicle {
    private double batteryCapacity;
    private double maxSpeed;

    public eScooter(String brand, int year, double batteryCapacity, double maxSpeed, Driver driver) {
        super(brand, year, driver);
        this.batteryCapacity = batteryCapacity;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric scooter powered on: " + brand);
    }

    @Override
    public void stopEngine() {
        System.out.println("Electric scooter powered off: " + brand);
    }


}
