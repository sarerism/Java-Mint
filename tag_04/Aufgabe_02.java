package tag_04;

public class Aufgabe_02 {

    public static void main(String[] args) {

        String text = "Hello der World";

        // Task b: Check if text is empty
        if (text.isEmpty()) {
            System.out.println("Empty text");
            return; // Exit the program if text is empty
        }

        // Task c: Print the length of the text
        int l = text.length();
        System.out.println(text + " has " + l + " letters.");

        // Task d: Print the first 5 characters if length > 5
        if (text.length() > 5) {
            String s = text.substring(0, 5);
            System.out.println("The first 5 characters of " + text + " are " + s);
        }

        // Task e: Convert to lowercase
        String newText = text.toLowerCase();
        System.out.println(newText);

        // Task f: Check if the lowercase text starts with "das"
        if (newText.startsWith("das")) {
            System.out.println("The " + newText + " starts with 'das'.");
        }

        // Task g: Check if "der" is in the text and print the index
        int derIndex = newText.indexOf("der");
        if (derIndex != -1) {
            System.out.println("'der' found at index: " + derIndex);
        } else {
            System.out.println("'der' does not occur in this text.");
        }

        // Task h: Check if text ends with "!" or "."
        if (!text.endsWith("!") && !text.endsWith(".")) {
            text = text.concat(".");
            System.out.println("Updated text: " + text);
        }
    }
}
