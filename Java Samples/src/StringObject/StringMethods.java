package StringObject;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = " Hello Java World! ";
        String str2 = " hello java world! ";

        System.out.println("---------Basic Methods------------");
        // length -- returns the #characters in a string
        System.out.println("Length of " + str1 + " is " + str1.length());

        // charAt -- returns the character at a given index
        System.out.println(str1.charAt(0));
        System.out.println("Character at the index 10 of the String " + str1 + " is " + str1.charAt(10));

    }
}
