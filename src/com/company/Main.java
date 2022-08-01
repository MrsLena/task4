package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {


      /*  Анагра́мма — строка, составленная путем перестановки букв исходной строки, например “ABB CAA“ - “BA BCAA“ -> “CBA BAA“ ……
        В задаче дано 2 строки и символов латинского алфавита и пробелов, нужно определить, являются ли они анаграммами.
                Если знаете, предложите несколько алгоритмов\подходов к решению данной задачи.*/

        String s1 = "ABB CAA";
        String s2 = "BA BCAA";

        List<String> list1 = new ArrayList<>();

        for (int i=0; i<s1.length(); i++) {
            list1.add(s1.substring(i,i+1));
        }

        Collections.sort(list1);

        List<String> list2 = new ArrayList<>();

        for (int i=0; i<s2.length(); i++) {
            list2.add(s2.substring(i,i+1));
        }

        Collections.sort(list2);


        if (list1.hashCode()==list2.hashCode()) {
            System.out.println("Строки-аннаграммы: ");
        }
        else {
            System.out.println("Строки НЕ являются аннаграммами: ");
        }
        System.out.println(s1);
        System.out.println(s2);





    }
}
