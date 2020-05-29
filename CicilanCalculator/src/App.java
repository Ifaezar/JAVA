package CicilanCalculator.src;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int hargaAwal;
        int durasi;
        double bunga;

        hargaAwal = Console.inputNumber("Harga Pinjaman = ");
        durasi = Console.inputNumber("Lama Pinjaman = ");
        bunga = (double) Console.inputNumber("Bunga = ");

        Pinjaman pinjaman = new Pinjaman(hargaAwal, bunga, durasi);
        double bayaranPerBulan = Show.bayaranTiapBulan(pinjaman.getHargaAwal(), pinjaman.getBunga(), pinjaman.getDurasi());
        Show.tagihanPerBulan(bayaranPerBulan);
        Show.sisaBayaranPerBulan(pinjaman.getHargaAwal(), pinjaman.getBunga(), pinjaman.getDurasi(), bayaranPerBulan);
    }
}
