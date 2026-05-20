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

        // isEmpty -- return boolean check if the length of the string is 0
        System.out.println(str1.isEmpty()); // false

        // isBlank -- return boolean check if the string contains a blank space
        System.out.println(str1.isBlank());

        // equals
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        // startsWith endsWith
        System.out.println(str1.startsWith("Java"));
        System.out.println(str1.endsWith("Java"));

        // String.format
        System.out.printf("Language: %s, Version: %d", "Java", 21);

    }
}
