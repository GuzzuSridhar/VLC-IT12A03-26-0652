package innerclass;

public class Main {
    public static void main(String[] args) {
        Greeting specialGreeting = new Greeting() {
            @Override
            void sayHello() {
                System.out.println("Hello from Annonymous Inner class");
            }
        };

        specialGreeting.sayHello();
    }
}
