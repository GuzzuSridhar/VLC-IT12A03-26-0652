package StringObject;

public class StringCompare {
    public static void main(String[] args) {
        // use the following methods to compare Strings
        // Avoid using (==) to compare Strings
        /*
         * 1. equals
         * 2. equalsIgnoreCase
         */
        String sone = "Something";
        String stwo = "something";
        String sthree = "Anything";
        String sfour = "anything";

        // case sensitive compare
        System.out.println(sone.equals(stwo));
        System.out.println(sthree.equals(sfour));

        // case insensitive compare
        System.out.println(sone.equalsIgnoreCase(stwo));
        System.out.println(sthree.equalsIgnoreCase(sfour));
    }
}
