package immutablity;

public class StringImmutable {
    public static void main(String[] args) {
        String name = "Bill";
        System.out.println("Original Memory Address of String :" + name.hashCode());
        name = "John";
        System.out.println(" Changed Memory Address of String :" + name.hashCode());

        StringBuilder fName = new StringBuilder("Bill");
        System.out.println("Original Memory Address of String builder:" + fName.hashCode());
        fName.replace(0, fName.length(), "John");
        System.out.println(" Changed Memory Address of String Builder:" + fName.hashCode());

    }

}
