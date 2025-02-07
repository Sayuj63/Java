public class Stringg_string_builder {
    public static void main(String[] args) {
        stringOperations();
        stringBuilderOperations();
    }

    public static void stringOperations() {
        String str = "Hello, World!";
        System.out.println("Original String: " + str);
        System.out.println("Length of String: " + str.length());
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
    }

    public static void stringBuilderOperations() {
        StringBuilder sb = new StringBuilder("Hello, World!");
        System.out.println("Original StringBuilder: " + sb.toString());
        sb.append(" Welcome to Java.");
        System.out.println("After append: " + sb.toString());
        sb.insert(13, " Beautiful");
        System.out.println("After insert: " + sb.toString());
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb.toString());
    }
}