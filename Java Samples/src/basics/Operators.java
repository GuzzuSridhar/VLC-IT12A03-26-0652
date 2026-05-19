package basics;

public class Operators {
    public static void main(String[] args) {
        /*
         * Arithmetic
         * Assignment
         * Comparision
         * Logical
         * Shift
         * bitwise
         */

        // Arithmetic Operators
        // + - * / % ++ --

        int x = 10, y = 20, res = 0;

        System.out.println("----------------Arithmetic Operators----------");

        System.out.println(x + y); // addition
        System.out.println(x - y); // Subtraction
        System.out.println(x * y); // Multiplication
        System.out.println(x / y); // Division
        System.out.println(x % y); // Modulus

        System.out.println("----------------Increment and Decrement----------");
        // increment (post and pre)
        res = x++; // use the current value of x in the expression and then increment
        System.out.println(res); // 10
        System.out.println(x); // 11

        res = ++x; // first increment and then use the value of x in this expression
        System.out.println(res); // 12
        System.out.println(x); // 12

        // decrement (post and pre)
        res = x--; // use the current value of x in the expression and then decrement
        System.out.println(res); // 12
        System.out.println(x); // 11

        res = --x; // first decrement and then use the value of x in this expression
        System.out.println(res); // 10
        System.out.println(x); // 10

        System.out.println("----------------Assignment Operators----------");

        // Assignment Operators
        // = += -= *= /= %=

        // equals
        x = 30;
        y = 20;

        // +=
        x += 10;
        System.out.println(x); // 40

        // -=
        x -= 10;
        System.out.println(x);

        // *=
        x *= 10;
        System.out.println(x);

        // /=
        x /= 10;
        System.out.println(x);

        // %=
        x %= 10;
        System.out.println(x);

        System.out.println("----------------Comparision Operators----------");
        // the output of a expression with a comparision operator will always be boolean
        // == != > >= < <=

        // equality check
        System.out.println(x == 10);

        // inequality check
        System.out.println(x != 10);

        // greater than check
        System.out.println(x > 10);

        // greater than equals check
        System.out.println(x >= 10);

        // less than check
        System.out.println(x < 10);

        // less than equals check
        System.out.println(x <= 10);

        System.out.println("----------------Logical Operators----------");

        // Logical Operators
        // the logical operators are to be used to compound one or more comparision
        // operators
        // the output of a expression with a logical operator will always be boolean
        // && || !

        System.out.println(x > 10 && y < 20); // logial AND
        System.out.println(x > 10 || y < 20); // logial OR
        System.out.println(!(x > 10 || y < 20)); // logial NOT

        // bitwise
        // & | ~
        System.out.println(x & y); // bitwise AND
        System.out.println(x | y); // bitwise OR
        System.out.println(~x); // bitwise NOT

        // Shift Operators
        System.out.println("----------------Shift Operators----------");
        System.out.println(x << 2);
        System.out.println(x >> 2);
        System.out.println(x >>> 2);

    }
}
