package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka = ");
        int cari = scanner.nextInt();
        System.out.println(includeArray(cari));

    }

    public static boolean includeArray(int find) {
        int number[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < number.length; i++) {
            if (number[i] == find) {
                return true;
            }
        }
        return false;
    }
}