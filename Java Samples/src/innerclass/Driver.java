package innerclass;

public class Driver {
    public static void main(String[] args) {

        // Create an instance of the outer class
        OuterClass outerClass = new OuterClass();

        // Use the Outer class object to create the inner class object / instance
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Call the method from the inner class
        innerClass.sayHello();

    }
}
