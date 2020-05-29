package CicilanCalculator.src;

import java.text.NumberFormat;

public class Show {
    private static final int BUlAN = 12;
    private static final int PERCENT = 100;
    private static double totalBunga;
    private static double totalBulan;
    private static double sisaBayaran;

    public static double bayaranTiapBulan(int hargaAwal, double bunga, int durasi) {
        totalBunga = bunga / PERCENT;
        totalBulan = durasi * BUlAN;
        sisaBayaran = hargaAwal + (hargaAwal * totalBunga);
        return sisaBayaran / totalBulan;
    }

    public static void tagihanPerBulan(double bayaranPerBulan) {
        System.out.println("================ Pembayaran Tiap Bulan ================");
        bayar(bayaranPerBulan);
    }

    public static void sisaBayaranPerBulan(int hargaAwal, double bunga, int durasi, double bayaranPerBulan) {
        System.out.println("================ Sisa Bayaran Tiap Bulan ================");
        for (int i = 0; i < totalBulan; i++) {
            sisaBayaran -= bayaranPerBulan;
            bayar(sisaBayaran);
        }
    }

    public static void bayar(double totalHarga) {
        System.out.println(NumberFormat.getCurrencyInstance().format(totalHarga));
    }
}