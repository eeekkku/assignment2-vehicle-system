public class bicycle extends Vehicle {
    private boolean hasGears;

    public bicycle(String brand, int year, boolean hasGears, Driver driver) {
        super(brand, year, driver);
        this.hasGears = hasGears;
    }

    @Override
    public void startEngine() {
        System.out.println("Bicycle ride started: " + brand);
    }
    @Override
    public void stopEngine() {
        System.out.println("Bicycle ride stopped: " + brand);
    }

}
