package com.example.methodiainternship;

public class StringReverse {
    public static void main(String[] args) {
        String n = "Methodia";
        System.out.println(reverse(n));
        System.out.println(3/2);

    }
    public static String reverse(String input) {
        char[] array = input.toCharArray();
        int length = array.length;
        int halfLength = length/2;
        for (int i=0; i<halfLength; i++) {
            char temp = array[i];
            array[i] = array[length-1-i];
            array[length-1-i] = temp;
        }
        return new String(array);
    }
    /*
    Това е решението ми към задача номер 1.
    За да обърнем стринг, първия чар на стринга трябва да отиде на мястото на последния чар,
    а последния чар трябва да отиде на мястото на първия чар. Втория чар трябва да размени местата с предпоследен чар и тнт.
    Ако представим един стринг като поредица от чарове, ще е char[0] = char[array.length - 1],
    char[1] = char[array.length - 1- 1] и тнт.
     */


}
