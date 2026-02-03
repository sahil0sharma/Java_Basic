package Practice.file3.practice;

public class reverse_word {
    public static void main(String[] args) {
        String sentence = "Java is easy";

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder rev = new StringBuilder(word);
            result.append(rev.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}

