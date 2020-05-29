import java.util.Arrays;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int number = 5;

        byte umur = 78;

        float desimal = 178.72F;

        double iniDouble = 178.72D;

        String nama = "ilham";

        String people[] = new String[5];
        people[0] = "Ilham";
        people[1] = "Faezar";
        people[2] = "Noor";
        people[3] = "Kiranda";
        people[4] = "hehe";

        int angka[] = new int[5];
        for (int i = 0; i < angka.length; i++) {
            angka[i] = i + 1;
        }
        int matriks[][] = new int[5][5];
        matriks[0][0] = 2;
        matriks[0][1] = 1;
        matriks[0][2] = 3;

        System.out.println("Number = " + number);
        System.out.println("Umur = " + umur);
        System.out.println("Desimal = " + desimal);
        System.out.println("Double = " + iniDouble);
        System.out.println("String = " + nama);
        System.out.println("Array = " + Arrays.toString(people));
        System.out.println("Array = " + Arrays.toString(angka));
        System.out.println("Array = " + Arrays.deepToString(matriks));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Umur = ");
        byte inputUmur = scanner.nextByte();
        // System.out.println("Umur = " + inputUmur);

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Masukkan Nama = ");
        String inputNama = scanner2.next();

        System.out.println("Nama = " + inputNama + " umur = " + inputUmur + " tahun");

    }
}