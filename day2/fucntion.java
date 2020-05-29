package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class fucntion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka 1 = ");
        int inputMin = scanner.nextInt();

        System.out.print("Angka 2 = ");
        int inputMax = scanner.nextInt();
        System.out.println(generateArray(inputMin, inputMax));

    }

    public static ArrayList<Integer> generateArray(int min, int max) {

        if (min < max) {
            ArrayList<Integer> Result = new ArrayList<Integer>();
            for (int i = min; i < max; i++) {
                Result.add(i);
            }
            return Result;
        } else {
            return new ArrayList<Integer>();
        }

    }

    // tanpa return
    // public static void generateArray(int min, int max) {
    // ArrayList<Integer> Result = new ArrayList<Integer>();
    // for (int i = min; i < max; i++) {
    // Result.add(i);
    // }
    // System.out.println(Result);
    // }
}