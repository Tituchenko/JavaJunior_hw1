package ru.geekbrains.lesson1.task3;

import java.util.ArrayList;
import java.util.List;

public class dz {
    public static void main(String[] args) {
        List<Integer> Numbers=new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Numbers.add(i);
        }
        Numbers.add(22);
        List<Integer> onlyOdd=Numbers.stream().filter(N->N%2==0).toList();
        System.out.println("Список:"+Numbers);
        System.out.println("Список четных числе: "+onlyOdd);
        System.out.println("Среднее четных числе: "+
                ((double) onlyOdd.stream().mapToInt(Integer::valueOf).sum())/onlyOdd.size());


    }
}
