package controlstructures.loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        // break with for loop
        for (int i = 1; i < 11; i++) {
            if (i == 5)
                break; // when a break statement is encountered, the loop is exited
            System.out.print(i + " ");
        }

        System.out.println();

        // continue statement with a for loop
        for (int i = 1; i < 11; i++) {
            if (i == 5)
                continue; // skips the execution of the current iteration (from this line and returns to
                          // the loop begin)
            System.out.print(i + " ");
        }
    }
}
