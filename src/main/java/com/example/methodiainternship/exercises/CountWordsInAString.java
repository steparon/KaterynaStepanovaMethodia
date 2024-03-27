package com.example.methodiainternship.exercises;

import java.util.HashMap;
import java.util.Map;

public class CountWordsInAString {
    public static void main(String[] args) {

        System.out.println(countWords("Kateryna is applying for the internship at Methodia"));

    }
    public static int countWords(String input) {
        Map<String, Integer> map = new HashMap<>();
        int count = 1;

        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], count);
            count++;
        }

        if (words.length == 0) {
            return 0;
        }

        int result = map.get(words[words.length-1]);
        return result;
    }
}
/* Задача номер 2.
Всеки път, когато добавям една дума в ХашМапа, се увеличава стойност в двойката ключ-стойност.
Това означава че, последната дума, ще има максималната стойност, и можем лесно да я намерим в ХашМапа.
 */
