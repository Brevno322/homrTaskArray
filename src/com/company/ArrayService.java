package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class ArrayService {


    public void Positive() {
        //1)В массиве найти количество положительных элементов.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int ind = scanner.nextInt();
        int[] chet = new int[ind];
        System.out.println("Введите содержимое каждого индекса ");
        int shet = 0;
        for (int i = 0; i < chet.length; i++) {
            chet[i] = scanner.nextInt();

            if (chet[i] % 2 == 0)

                shet++;
        }
        System.out.println("количество положительных чисел в масиве :" + shet);


    }

    public void MiddleNumber() {
        // Найти среднее арифметическое его элементов.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int ind = scanner.nextInt();
        int[] chet = new int[ind];
        System.out.println("Введите содержимое каждого индекса ");
        int sum = 0;
        for (int i = 0; i < chet.length; i++) {
            chet[i] = scanner.nextInt();
            sum = sum + chet[i];
        }
        sum /= ind;
        for (int i = 0; i < chet.length; i++) {
            if (chet[i] > sum) {
                System.out.println(chet[i]);
            }


        }


    }

    public void DeleteElements() {
        //Из массива удалить все повторяющиеся элементы
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int ind = scanner.nextInt();
        int[] chet = new int[ind];

        System.out.println("Введите содержимое каждого индекса ");
        for (int i = 0; i < chet.length; i++) {
            chet[i] = scanner.nextInt();
            for (int j = chet.length; j > 0; j--) {
                if (chet[i] == chet[j]) {
                    int []dop=new int[chet.length-1];
                    dop[i]=dop[j];
                    System.out.println(dop[i]);
                }

            }
        }



    }

    public void PlusNumbers() {
        //Добавить элемент в массив(вводим место на которое будем добавлять, массив, что будем добавлять
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int ind = scanner.nextInt();
        int[] chet = new int[ind];
        System.out.println("Введите содержимое каждого индекса ");
        for (int i = 0; i < chet.length; i++) {
            chet[i] = scanner.nextInt();
            System.out.println(chet[i]);
        }

            System.out.println("Выберите в какой индекс ");
            int zamena=scanner.nextInt();
        for (int i = ind+1; i <zamena; i--) {
            chet[i]=chet[i-1];
        } System.out.println("Выберите число ");
        int zamena1=scanner.nextInt();
        chet[zamena]=zamena1;

        for (int i = 0; i <chet.length; i++) {
            System.out.println(chet[i]);

        }


    }
}
