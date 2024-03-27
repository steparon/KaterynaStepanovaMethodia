package com.example.methodiainternship.exercises;

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


/* Задача номер 3.
   Метод arrayItirator обхожда ArrayList с while loop и for loop, и отпечатва всеки елемент.
 */
