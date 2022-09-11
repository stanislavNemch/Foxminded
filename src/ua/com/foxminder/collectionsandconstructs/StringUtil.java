package ua.com.foxminder.collectionsandconstructs;

public class StringUtil {

    public static void arrayWords(String text){

        StringBuilder recoverSource = new StringBuilder();

        for (String word : text.split(" ")) { // Перебор for-each массива слов

            System.out.println(word.toCharArray());  // Вывод слов из массива разбитых слов

            for (char letter : word.toCharArray()) {      // for-each для перебора букв разбитого массива слов
                System.out.println(letter);     // Вывод букв из беребора массива слов
                System.out.println(recoverSource.append(letter)); // Формирование вывода слова, на основании перебора массива букв
            }

            recoverSource.append(" "); //Добавление пробела между словами
        }
    }

    public static void main(String[] args) {

        arrayWords("Hello World!");

        System.out.println();

       // arrayWords("Many people love Java!");

    }
}
