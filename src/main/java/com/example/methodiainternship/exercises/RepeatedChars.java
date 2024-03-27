package com.example.methodiainternship.exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatedChars {
    public static void main(String[] args) {

        System.out.println(repeatedChars("Aaa b v g e yo b"));

    }

    static ArrayList<Character> repeatedChars(String input) {
        ArrayList<Character> repeatedChars = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != ' ') {
                if (map.containsKey(input.charAt(i))) {
                    int value = map.get(input.charAt(i)).intValue();
                    map.put(input.charAt(i), value + 1);
                } else {
                    map.put(input.charAt(i), 1);
                }
            }
        }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    repeatedChars.add(entry.getKey());
                }
            }
            return repeatedChars;
        }
    }

    /* Решението към задачата номер 4.
    В тази задача добавям чарове от стринга в ХашМап, където ключ - е чар, а стоиност е интеджер.
    Всеки път, когато добавяме двойка с ключ, който вече е добавен (когато чар се повтаря), стоиността се увеличава с 1.
    Така знаем, че ако стоиност е повече от 1, чар се повтаря.
    Добавих if (ch != ' ') в ред 20 за да не броим празни места, които се повтарят.
     */


