package inheritence;

public class GrandChild extends Child {

    public GrandChild() {
        System.out.println("Grand child constructor called");
    }

    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.parentMethod();
        gc.childMethod();
    }
}
