
package driver;

import model.Model1;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Model1> data = new ArrayList<>();

        while (true) {
            System.out.print("Masukkan kode kota (atau END): ");
            String kode = input.nextLine();

            if (kode.equalsIgnoreCase("END")) {
                break;
            }

            System.out.print("Masukkan berat paket Butet: ");
            double beratButet = input.nextDouble();
            input.nextLine();

            // Tentukan data kota
            String kota = "";
            double harga = 0;
            String kategori = "";

            if (kode.equalsIgnoreCase("MDN")) {
                kota = "Medan";
                harga = 8000;
                kategori = "Dalam Pulau";
            } else if (kode.equalsIgnoreCase("BLG")) {
                kota = "Balige";
                harga = 5000;
                kategori = "Dalam Pulau";
            } else if (kode.equalsIgnoreCase("JKT")) {
                kota = "Jakarta";
                harga = 12000;
                kategori = "Luar Pulau";
            } else if (kode.equalsIgnoreCase("SBY")) {
                kota = "Surabaya";
                harga = 13000;
                kategori = "Luar Pulau";
            } else {
                System.out.println("Kode tidak valid!\n");
                continue;
            }

            // Simpan ke ArrayList
            data.add(new Model1(kode, kota, harga, kategori, beratButet));
        }

        // ================= OUTPUT SEMUA =================
        System.out.println("\n===== SEMUA STRUK DEL-EXPRESS =====");

        for (Model1 m : data) {

            double beratUcok = (3.0 / 2.0) * m.beratButet;
            double totalBerat = m.beratButet + beratUcok;
            double totalOngkir = totalBerat * m.hargaPerKg;

            String promo = "Tidak ada";

            if (totalBerat > 10 && m.kategori.equals("Luar Pulau")) {
                totalOngkir *= 0.9;
                promo = "Diskon 10% + Asuransi Gratis";
            } else if (totalBerat > 10) {
                totalOngkir *= 0.9;
                promo = "Diskon 10%";
            } else if (m.kategori.equals("Luar Pulau")) {
                promo = "Asuransi Gratis";
            }

            System.out.println("\n----------------------------");
            System.out.println("Kota Tujuan  : " + m.kota);
            System.out.println("Berat Butet  : " + m.beratButet + " kg");
            System.out.println("Berat Ucok   : " + beratUcok + " kg");
            System.out.println("Total Berat  : " + totalBerat + " kg");
            System.out.println("Total Ongkir : Rp " + totalOngkir);
            System.out.println("Promo        : " + promo);
        }

        System.out.println("\n============================");

        input.close();
    }
}
