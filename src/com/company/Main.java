package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;

    public static void main(String[] args) {

            in = new Scanner(System.in);

            System.out.println("Введите число, до которого пойдет цикл: ");
            testingInput();
            int border = in.nextInt();
            int sum = 0;

            for (int i = 1; i <= border; i++){
                if (i % 2 == 0){
                    System.out.print(i + " ");
                    sum = sum + i;
                }
            }
            System.out.println("\nСумма чисел равна: " + sum);
    }

    private static void testingInput() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }
}
