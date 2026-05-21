package mathclass;

public class MathMethods {
    public static void main(String[] args) {
        double d = 0.4;

        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        System.out.println(Math.round(d));
        System.out.println(Math.abs(d));
        System.out.println(Math.max(100, 200));
        System.out.println(Math.min(100, 200));

        // nesting of maethods
        int x = 1, y = 3, z = 5;
        System.out.println(Math.max(x, Math.max(y, z)));

        // random numbers
        System.out.println(Math.random()); // returns a random number between 0 and 1
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random() * 10));

    }
}
