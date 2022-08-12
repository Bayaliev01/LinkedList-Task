package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
        }
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0, 2));

        }
        for (int i = 0; i < 18; i++) {
            arrayList.add(random.nextInt(0, 2));
        }
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println(arrayList);
        System.out.println(linkedList);

        san(array);
    }

    public static void san(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i;j--) {
                if (array[j - 1] > array[j]) {
                    int or = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = or;
                }
            }
            System.out.print(array[i] + " ");
        }
    }
}