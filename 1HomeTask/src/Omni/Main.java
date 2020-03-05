package Omni;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое значение :");
        int x = in.nextInt();
        System.out.println("Введите второе значение : ");
        int y = in.nextInt();
        long result = (long) Math.pow(x, y);
        System.out.println("Результат " + result);

    }
}
