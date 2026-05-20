package classesandobjects.honda;

public class Honda {
    // Basic Identifiers
    String modelName;
    String bodyType; // e.g., Sedan, SUV, Truck
    double basePrice;

    // Performance Specs
    String engineType; // e.g., Turbo, Naturally Aspirated, Hybrid
    int horsepower;
    String drivetrain; // e.g., FWD, AWD

    // Feature Toggles (Enabled or Disabled)
    boolean hasSunroof;
    boolean hasLeatherSeats;
    boolean hasAppleCarPlay;
    boolean hasHondaSensing; // Honda's advanced safety/driver-assist suite
    boolean isHybrid;

    // Constructor to easily assemble our specific car models
    public Honda(String modelName, String bodyType, double basePrice, String engineType,
            int horsepower, String drivetrain, boolean hasSunroof, boolean hasLeatherSeats,
            boolean hasAppleCarPlay, boolean hasHondaSensing, boolean isHybrid) {

        this.modelName = modelName;
        this.bodyType = bodyType;
        this.basePrice = basePrice;
        this.engineType = engineType;
        this.horsepower = horsepower;
        this.drivetrain = drivetrain;
        this.hasSunroof = hasSunroof;
        this.hasLeatherSeats = hasLeatherSeats;
        this.hasAppleCarPlay = hasAppleCarPlay;
        this.hasHondaSensing = hasHondaSensing;
        this.isHybrid = isHybrid;
    }

    // Method to neatly display each car's unique configuration
    public void displaySpecs() {
        System.out.println("--- 2026 Honda " + modelName + " (" + bodyType + ") ---");
        System.out.println("Engine: " + engineType + " | Power: " + horsepower + " HP | Drivetrain: " + drivetrain);
        System.out.println("Premium Features Configured:");
        System.out.println("  > Sunroof: " + (hasSunroof ? "YES" : "NO"));
        System.out.println("  > Leather Interior: " + (hasLeatherSeats ? "YES" : "NO"));
        System.out.println("  > Apple CarPlay/Android Auto: " + (hasAppleCarPlay ? "YES" : "NO"));
        System.out.println("  > Honda Sensing Safety: " + (hasHondaSensing ? "YES" : "NO"));
        System.out.println("  > Hybrid Powertrain: " + (isHybrid ? "YES" : "NO"));
        System.out.println("Base MSRP: $" + basePrice + "\n");
    }
}