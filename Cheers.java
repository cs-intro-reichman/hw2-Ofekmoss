//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                String vowels = "AEFHILMNORSX";

                for (char c : name.toCharArray()) {
                        System.out.println(String.format("Give me %s %s: %s!", (vowels.indexOf(Character.toUpperCase(c)) != -1 ? "an" : "a "), Character.toUpperCase(c), Character.toUpperCase(c)));
                }

                int numberOfCheers = Integer.parseInt(args[1]);
                System.out.println("What does that spell?");
                for (int i = 0; i < numberOfCheers; i++) {
                        System.out.println(String.format("%s!!!", args[0].toUpperCase()));
                }
        }
}
