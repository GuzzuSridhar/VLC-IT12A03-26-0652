package stringbuilder;

public class SbMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);
        // length
        System.out.println(sb.length());
        // append
        System.out.println(sb.append(" Java"));
        // insert
        System.out.println(sb.insert(5, " Test"));
        // delete
        System.out.println(sb.delete(6, 11));

        // replace
        System.out.println(sb.replace(12, sb.length(), "Python"));

        // Reverse
        System.out.println(sb.reverse());

        // capacity
        System.out.println(sb.capacity());

        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        sb.trimToSize(); // Does not change the content, the memory allocated only is trimmed.
        System.out.println(sb.capacity());

    }
}
