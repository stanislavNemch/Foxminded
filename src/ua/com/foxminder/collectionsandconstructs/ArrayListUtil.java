package ua.com.foxminder.collectionsandconstructs;

import java.util.ArrayList;

public class ArrayListUtil {

    public static void arrayListWords(String text){

        ArrayList<Character> recoverSource = new ArrayList<>();

        for (String word : text.split(" ")) {

            System.out.println(word.toCharArray());

            for (char letter : word.toCharArray()) {
                System.out.println(letter);
                recoverSource.add(letter);
                System.out.println(recoverSource.toString()
                        .substring(1, 3 * recoverSource.size() - 1)
                        .replaceAll(", ", ""));
            }

            recoverSource.add(' ');
        }
    }

    public static void main(String[] args) {

        arrayListWords("Hello World!");

        System.out.println();

        // arrayWords("Many people love Java!");

    }
}
