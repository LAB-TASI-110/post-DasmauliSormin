package driver;


import java.util.*;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Model2> daftarBarang = new ArrayList<>();

        System.out.print("Masukkan jumlah data barang: ");
        int N = sc.nextInt();
        sc.nextLine(); // buang enter

        for (int i = 0; i < N; i++) {
            System.out.println("\nData barang ke-" + (i+1));

            System.out.print("Kategori barang : ");
            String kategori = sc.nextLine();   // ✅ bisa banyak kata

            System.out.print("Jumlah stok     : ");
            int stok = sc.nextInt();
            sc.nextLine(); // buang enter

            daftarBarang.add(new Model2(kategori, stok));
        }

        System.out.print("\nMasukkan kategori yang ingin dihitung: ");
        String target = sc.nextLine().toUpperCase();

        int total = 0;
        boolean ditemukan = false;

        for (Model2 barang : daftarBarang) {
            if (barang.getKategori().equals(target)) {
                total += barang.getStok();
                ditemukan = true;
            }
        }

        System.out.println("\n===== HASIL =====");
        if (ditemukan)
            System.out.println("Total stok kategori " + target + " = " + total);
        else
            System.out.println("Kategori tidak ditemukan");

        sc.close();
    }
}
