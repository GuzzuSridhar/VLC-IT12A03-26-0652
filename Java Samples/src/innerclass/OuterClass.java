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
