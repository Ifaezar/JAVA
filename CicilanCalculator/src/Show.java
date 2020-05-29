package CicilanCalculator.src;

import java.text.NumberFormat;

public class Show {
    private static final int BUlAN = 12;
    private static final int PERCENT = 100;

	public static void sisaBayaranPerBulan(int hargaAwal, double bunga, int durasi, double bayaranPerBulan) {
	    double sisaBayaran = hargaAwal + (hargaAwal * (bunga / PERCENT));
	    System.out.println("================ Sisa Bayaran Tiap Bulan ================");
	    for (int i = 0; i < durasi * BUlAN; i++) {
            sisaBayaran -= bayaranPerBulan;
            bayar(sisaBayaran);
	    }
	}

	public static void tagihanPerBulan(double bayaranPerBulan) {
        System.out.println("================ Pembayaran Tiap Bulan ================");
        bayar(bayaranPerBulan);
	}

	public static double bayaranTiapBulan(int hargaAwal, double bunga, int durasi) {
	    return (hargaAwal + (hargaAwal * (bunga / PERCENT))) / (durasi * BUlAN);
	}
    
    public static void bayar(double totalHarga ){
        System.out.println(NumberFormat.getCurrencyInstance().format(totalHarga));
    }
}