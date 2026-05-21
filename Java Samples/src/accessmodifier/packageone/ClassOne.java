package accessmodifier.packageone;

@SuppressWarnings("unused")
public class ClassOne {
    // feilds
    private int privateFeild;
    public int publicFeild;
    int defaultFeild;
    protected int protectedFeild;

    private void privateMethod() {
    }

    public void publicMethod() {
    }

    void defaultMethod() {
    }

    protected void protectedMethod() {
    }

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        // test feild access
        classOne.privateFeild = 10;
        classOne.publicFeild = 10;
        classOne.protectedFeild = 10;
        classOne.defaultFeild = 10;
        // test method access
        classOne.privateMethod();
        classOne.publicMethod();
        classOne.protectedMethod();
        classOne.defaultMethod();

    }

}
