package methods.chaining;

public class Car {
    private String color;
    private int speed;

    // Return the Car object instead of void
    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public void drive() {
        System.out.println(color +
                " car" +
                " is " +
                "running at a speed of " +
                speed +
                " Kmph ");
    }
}
