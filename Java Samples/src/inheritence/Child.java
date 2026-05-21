package inheritence;

public class Child extends Parent {
    int childVar;

    // default constructor
    public Child() {
        System.out.println("child constructor called");
    }

    // method declarations
    void childMethod() {
        System.out.println("Child Method called");
    }

    @Override
    void favFood() {
        System.out.println("Chicken");
    }

    @Override
    void occupation() {
        System.out.println("Student");
    }
}
