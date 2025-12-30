public class Main {
    public static void main(String[] args) {
        // Create drivers
        Driver driver1 = new Driver("Daniyar", "DL10000");
        Driver driver2 = new Driver("Alan", "DL19020");

        // Create vehicles with drivers
        Vehicle car = new Car("Toyota", 2020, 4, "Petrol", driver1);
        Vehicle motorcycle = new Motorcycle("Yamaha", 2019, false, driver1);
        Vehicle truck = new Truck("Volvo", 2018, 5000, 4, driver2);
        Vehicle bicycle = new bicycle("Scott", 2020, true, driver2);
        Vehicle scooter = new eScooter("Xiaomi", 2022, 7.8, 25.0, driver2);

        // Array of vehicles#
        Vehicle[] vehicles = {car, motorcycle, truck, bicycle, scooter};

        // Loop through vehicles
        for (Vehicle v : vehicles) {
            v.startEngine();
            v.displayInfo();
            v.stopEngine();
            System.out.println(".");
        }
    }
}
