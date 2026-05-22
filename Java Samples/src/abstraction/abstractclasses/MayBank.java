package abstraction.abstractclasses;

public class MayBank extends BankRules {

    @Override
    public int setInerest() {
        return 3;
    }

    public MayBank() {
        System.out.println("***Welcome to MayBank****");
        // BankRules bankRules = new BankRules(); // not allowed

        // accessing the concrete methods from the abstract class
        MayBank mayBank = new MayBank();
        mayBank.canCloseAcct("abc");
        mayBank.isValidCustomer("xyz");

    }

}
