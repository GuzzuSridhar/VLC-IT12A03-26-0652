package accessmodifier.packageone;

public class ClassTwo {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        // test feild access
        // classOne.privateFeild = 10; // not allowed
        classOne.publicFeild = 10;
        classOne.protectedFeild = 10;
        classOne.defaultFeild = 10;
        // test method access
        // classOne.privateMethod(); // not allowed
        classOne.publicMethod();
        classOne.protectedMethod();
        classOne.defaultMethod();

    }
}
