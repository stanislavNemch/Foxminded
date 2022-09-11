package ua.com.foxminder.collectionsandconstructs;

public class StringUtil {

    public static void arrayWords(String text){

        StringBuilder recoverSource = new StringBuilder();

        for (String word : text.split(" ")) {

            System.out.println(word.toCharArray());

            for (char letter : word.toCharArray()) {
                System.out.println(letter);
                System.out.println(recoverSource.append(letter));
            }

            recoverSource.append(" ");
        }
    }

    public static void main(String[] args) {

        arrayWords("Hello World!");

        System.out.println();

       // arrayWords("Many people love Java!");

    }
}
