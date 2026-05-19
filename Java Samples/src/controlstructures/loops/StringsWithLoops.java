package controlstructures.loops;

import java.util.Scanner;

public class StringsWithLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter some Text :");
        String str = in.next();

        // looping thru the string
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }

        in.close();
    }
}
