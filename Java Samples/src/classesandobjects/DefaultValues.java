package classesandobjects;

public class DefaultValues {
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    String st;
    boolean bo;
    char ch;

    public static void main(String[] args) {
        DefaultValues df = new DefaultValues();
        System.out.println("The default value of the byte type is " + df.b);
        System.out.println("The default value of the short type is " + df.s);
        System.out.println("The default value of the int type is " + df.i);
        System.out.println("The default value of the long type is " + df.l);
        System.out.println("The default value of the float type is " + df.f);
        System.out.println("The default value of the double type is " + df.d);
        System.out.println("The default value of the string type is " + df.st);
        System.out.println("The default value of the boolean type is " + df.bo);
        System.out.println("The default value of the character type is " + df.ch);

    }

}
