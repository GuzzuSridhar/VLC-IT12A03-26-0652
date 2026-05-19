package arrays;

public class DeclareArrays {
    public static void main(String[] args) {
        // Arrays in java are homogenous (all ements are of same type)
        // Arrays in Java are of fixed size
        // once array is declared , its size cannot be changed
        // Arrays can contain primitive types or objects
        // Arrays in java are zero based indexed
        // there are 3 ways of declaring an array

        // Method 1
        // declare an array without initialization
        String[] names = new String[5]; // declared an array of 5 String elements
        // String names[] = new String[5]; // declared an array of 5 String elements

        // Method 2
        // declare and Initialize
        int[] age = { 10, 26, 78, 67, 55 };

        // Method 3
        // declare and Initialize
        int[] x = new int[] { 10, 26, 78, 67, 55 };

        // print the length of the array

        System.out.println(names.length);
        System.out.println(age.length);
        System.out.println(x.length);

        // print the values of the empty array
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        // adding elements to the empty array
        names[0] = "John";
        names[1] = "Alex";
        names[2] = "Bill";
        names[3] = "Sara";
        names[4] = "Jill";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        System.out.println("-----------Print with Loop-------------");
        // using tradiditional for loop to traverse the array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("-----------Print with Enhanced For Loop-------------");
        // special for loop (enhanced for loop) to work with arrays
        for (String name : names) {
            System.out.println(name);
        }

        for (int i : x) {
            System.out.println(i);
        }

        for (int i : age) {
            System.out.println(i);
        }

    }
}
