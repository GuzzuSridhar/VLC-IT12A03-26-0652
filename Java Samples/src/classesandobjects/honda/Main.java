package classesandobjects.honda;

public class Main {
    public static void main(String[] args) {

        // Object 1: The sporty Civic Sedan (Basic tech, non-hybrid, nimble)
        Honda civic = new Honda(
                "Civic Sport", "Sedan", 26250.00,
                "2.0L 4-Cylinder", 158, "FWD",
                false, false, true, true, false);

        // Object 2: The premium CR-V Hybrid SUV (Loaded with safety, tech, and leather)
        Honda crv = new Honda(
                "CR-V Sport Touring", "SUV", 40800.00,
                "2.0L Hybrid System", 204, "AWD",
                true, true, true, true, true);

        // Object 3: The rugged Ridgeline Truck (High horsepower, AWD, no hybrid tech)
        Honda ridgeline = new Honda(
                "Ridgeline Trailsport", "Truck", 45000.00,
                "3.5L V6", 280, "AWD",
                true, true, true, true, false);

        // Turn the keys and display their configurations!
        civic.displaySpecs();
        crv.displaySpecs();
        ridgeline.displaySpecs();
    }
}
