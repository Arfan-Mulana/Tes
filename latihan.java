package latihan;

import java.util.Scanner;

public class latihan {
    public static void main(String[] args) {
        Double awalHarga, jumlahBarang, akhirHarga, diskon;

        Scanner scan = new Scanner(System.in);
        System.out.print("masukkan harga barang: ");
        awalHarga = scan.nextDouble();
        System.out.print("masukan persen diskon: ");
        diskon = scan.nextDouble();
        System.out.print("masukan jumlah barang yang dibeli: ");
        jumlahBarang = scan.nextDouble();

        akhirHarga =(awalHarga - (awalHarga*diskon/100))*jumlahBarang;
        System.out.println("hasil dari luas trapesium: " + akhirHarga);

    }

}
