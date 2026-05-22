package accessmodifier.packagetwo;

import accessmodifier.packageone.ClassOne;

public class ClassThree extends ClassOne {
    public static void main(String[] args) {
        ClassThree classThree = new ClassThree();
        // test feild access
        // classThree.privateFeild = 10; // not allowed
        classThree.publicFeild = 10;
        classThree.protectedFeild = 10;
        // classThree.defaultFeild = 10;
        // test method access
        // classThree.privateMethod(); // not allowed
        classThree.publicMethod();
        classThree.protectedMethod();
        // classThree.defaultMethod();
    }
}
