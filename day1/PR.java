import java.util.Scanner;

public class PR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama = ");
        String inputNMama = scanner.nextLine();

        System.out.print("Masukkan Alamat = ");
        String inputAlamat = scanner.nextLine();

        System.out.print("Masukkan Umur = ");
        byte inputUmur = scanner.nextByte();

        System.out.print("Masukkan Tahun Lahir = ");
        int inputTahun = scanner.nextInt();

        String template = "Nama anda = %s , berumur %b tahun tinggal di %s, lahir tahun %d ";

        String result = String.format(template, inputNMama, inputUmur, inputAlamat, inputTahun);

        System.out.println(result);
    }
}