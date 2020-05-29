package day2;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

import java.util.ArrayList;
import java.util.Arrays;

public class day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka 1 = ");
        int inputMin = scanner.nextInt();

        System.out.print("Angka 2 = ");
        int inputMax = scanner.nextInt();

        // int Result[] = new int[(inputMax - inputMin) + 1];

        // for (int i = 0; i < Result.length; i++) {
        // Result[i] = i + inputMin;
        // }

        ArrayList<Integer> Result = new ArrayList<Integer>();
        for (int i = inputMin; i < inputMax; i++) {
            Result.add(i);
        }
        System.out.println(Result);

    }
}