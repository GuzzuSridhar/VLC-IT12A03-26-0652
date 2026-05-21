package block;

public class Blocks {
    public static void main(String[] args) {
        /*
         * Block:
         * A block is a logical group of statements / variables / conditions etc..
         * Three types of blocks
         * 1.Local blocks
         * 2. instance block
         * 3. static block
         */

        // local block
        if (10 < 20) {
            System.out.println();
        }

        Blocks b = new Blocks();
        Blocks c = new Blocks();
        Blocks d = new Blocks();

    }

    /*
     * instance block
     * Runs everytime an instance is created (when the new key word is used)
     * Used to open any resources to an instance or intsantiate a variable/s for
     * each instance
     */
    // instance block sample
    {
        System.out.println("New Instance created");
    }

    /*
     * static block
     * Runs once when the class is loaded
     * used to instantiate dB connection
     * instantiate any other resources used by the class
     */

    // static block sample
    static {
        System.out.println("Static Block called");
        // db connections---
    }
}
