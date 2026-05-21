package innerclass;

public class OuterClass {
    private String outerVar = "Hello from Outer class";

    // Inner Class
    class InnerClass {
        void sayHello() {
            System.out.println("Hello Inner Class " + outerVar);
        }
    }
}

class Main {
    public static void main(String[] args) {

        // Create an instance of the outer class
        OuterClass outerClass = new OuterClass();

        // Use the Outer class object to create the inner class object / instance
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Call the method from the inner class
        innerClass.sayHello();

    }
}