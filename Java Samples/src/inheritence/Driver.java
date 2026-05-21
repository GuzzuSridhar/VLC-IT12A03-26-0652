package inheritence;

public class Driver {
    public static void main(String[] args) {
        Child c = new Child();

        // call methods of child
        c.childVar = 10;
        c.childMethod();

        // parent method access
        c.parentVar = 19;
        c.parentMethod();
        c.favFood();
        c.occupation();

        Parent p = new Parent();
        p.parentVar = 100;
        p.favFood();
        p.occupation();
    }
}
