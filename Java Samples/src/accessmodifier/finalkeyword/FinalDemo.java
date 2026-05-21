package accessmodifier.finalkeyword;

public class FinalDemo {
    // final keyword is used for declaring constants
    // values of a final variable cannot be changed
    // final feilds cannot be declared without initialization
    public static final int finalVar = 10;

    public static void main(String[] args) {
        System.out.println(finalVar);
        // finalVar = 20; // not allowed
    }
}
