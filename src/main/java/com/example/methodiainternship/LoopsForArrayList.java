package com.example.methodiainternship;

import java.util.ArrayList;

public class LoopsForArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        arrayItirator(list);

    }

    public static void arrayItirator(ArrayList<String> list) {
        int index = 0;

        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}


/* Решението към задачата номер 3.
   Метод arrayItirator обходи ArrayList с while loop и for look, и отпечатва всеки елемент.
 */
