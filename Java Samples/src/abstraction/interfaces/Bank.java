package abstraction.interfaces;

public interface Bank {
    double fdInterest(double depAmt, int period);

    double rdInterest(double depAmt, int period);

    default double ccInterest(double roi) {
        return 2.5;
    }

}
