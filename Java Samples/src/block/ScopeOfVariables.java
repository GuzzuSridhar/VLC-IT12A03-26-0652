package block;

public class ScopeOfVariables {
    // class variable
    static int classVariable;
    // instance variable
    int instanceVariable;

    public static void main(String[] args) {
        /*
         * 1. Class Scope (fields)
         * a. In a class, outside any method or blocks
         * b. Accessible in any method / block
         * 
         * 2. Method Scope
         * a. Inside a method
         * b. Accessible only in the method that it is declared
         * 
         * 3. Block Scope
         * a. inside any block (curly braces like if, loop, instance block etc...)
         * b. Accessible only within the braces that it is declared
         * 
         * 4. Loop Scope
         * a. Declared inside for loop
         * b. Within the loop body
         * 
         * "INSIDE-OUT" Rule
         * Code inside a block can see the Variables in the outer block. Not vice versa
         */

        System.out.println(classVariable);
        // System.out.println(instanceVariable); // not allowed

    }

    void sayHello() {
        // access class variable
        System.out.println(classVariable);
        System.out.println(instanceVariable);
        // method variable
        int methodVariable = 10; // method variables have to instantiated before using them
        System.out.println(methodVariable);
    }

    static void staticSayHello() {
        // access class variable
        System.out.println(classVariable);
        // System.out.println(instanceVariable); // not allowed
        // System.out.println(methodVariable); // not allowed
    }

}
