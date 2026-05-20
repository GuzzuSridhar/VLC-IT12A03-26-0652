package controlstructures.loops;

public class NestedLoop {
    public static void main(String[] args) {
        // print 10 multiplication tables
        for (int i = 1; i < 11; i++) {
            System.out.println("Multiplication table of " + i);
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("----------------------------");
        }
    }
}
