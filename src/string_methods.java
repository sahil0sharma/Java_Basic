public class string_methods {
    public static void main(String[] args) {

        String s = "Hello World";

        System.out.println("Length: " + s.length());
        System.out.println("Char at 4: " + s.charAt(4));
        System.out.println("Substring: " + s.substring(0, 5));
        System.out.println("Contains 'World'? " + s.contains("World"));
        System.out.println("Equals? " + s.equals("Hello World"));
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Starts with He? " + s.startsWith("He"));
        System.out.println("Index of o: " + s.indexOf('o'));
        System.out.println("Last index of o: " + s.lastIndexOf('o'));

        String x = "  java  ";
        System.out.println("Trim: " + x.trim());

        System.out.println("Replace: " + s.replace("o", "0"));

        }
    }

