package abstraction.abstractclasses;

public abstract class BankRules {
    // abstract methods
    public abstract int setInerest();

    // concrete method
    public boolean isValidCustomer(String nric) {
        // check details
        return true;
    }

    public boolean canCloseAcct(String Acno) {
        // check the balance
        // check dues
        // clear refunds
        // move acct to archive
        return true;

    }

}
