package abstraction.interfaces;

public interface Mas {
    boolean archive(int acctno);

    // static method is a concrete method
    static int arch_period(int years) {
        return 5;
    }

    static void sayHello() {
        System.out.println("*****Welcome to MAS, Safe Banking*****");
    }
}
