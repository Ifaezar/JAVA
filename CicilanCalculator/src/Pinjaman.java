package CicilanCalculator.src;

public class Pinjaman {
    private int hargaAwal;
    private double bunga;
    private int durasi;

    public Pinjaman(int hargaAwal, double bunga, int durasi) {
        setHargaAwal(hargaAwal);
        setBunga(bunga);
        setDurasi(durasi);
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    public void setHargaAwal(int hargaAwal) {
        if (hargaAwal <= 1_000_000 && hargaAwal >= 100_000_000) {
            throw new IllegalArgumentException("Harga awal harus diantara 1.000.000 sampai 100.000.000");
        }
        this.hargaAwal = hargaAwal;
    }

    public double getBunga() {
        return bunga;
    }

    public void setBunga(double bunga) {
        if (bunga <= 0) {
            throw new IllegalArgumentException("Bunga harus diatas 0%");
        }
        this.bunga = bunga;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        if (durasi < 1) {
            throw new IllegalArgumentException("Durasi harus diatas atau sama dengan 1 tahun");
        }
        this.durasi = durasi;
    }

}