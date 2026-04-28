package driver;


import java.util.*;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Model3> daftarMenu = new ArrayList<>();
        ArrayList<Model3> pesanan = new ArrayList<>();

        // ===== MENU KAFETARIA (AUTO) =====
        daftarMenu.add(new Model3("Nasi Goreng", 15000));
        daftarMenu.add(new Model3("Mie Goreng", 14000));
        daftarMenu.add(new Model3("Ayam Geprek", 18000));
        daftarMenu.add(new Model3("Bihun Goreng", 13000));
        daftarMenu.add(new Model3("Teh Tarik 3T", 8000));

        System.out.println("===== KAFETARIA IT DEL =====");

        boolean lanjut = true;
        while(lanjut){
            // Tampilkan menu
            System.out.println("\nDaftar Menu:");
            for(int i=0;i<daftarMenu.size();i++){
                System.out.println((i+1)+". "
                        + daftarMenu.get(i).getNamaMenu()
                        + " - Rp" + daftarMenu.get(i).getHarga());
            }

            // Pilih menu
            System.out.print("\nPilih nomor menu: ");
            int pilih = sc.nextInt();

            if(pilih < 1 || pilih > daftarMenu.size()){
                System.out.println("Menu tidak tersedia!");
                continue;
            }

            System.out.print("Jumlah beli: ");
            int qty = sc.nextInt();

            Model3 m = daftarMenu.get(pilih-1);
            pesanan.add(new Model3(m.getNamaMenu(), m.getHarga(), qty));

            System.out.print("Tambah pesanan? (y/n): ");
            char jawab = sc.next().charAt(0);
            if(jawab == 'n' || jawab == 'N') lanjut = false;
        }

        // ===== CETAK STRUK =====
        int total = 0;
        System.out.println("\n===== STRUK PEMBAYARAN =====");
        for(Model3 item : pesanan){
            int sub = item.getSubtotal();
            total += sub;
            System.out.println(item.getNamaMenu() +
                    " x" + item.getJumlah() +
                    " = Rp" + sub);
        }

        System.out.println("--------------------------");
        System.out.println("TOTAL BAYAR = Rp" + total);

        sc.close();
    }
}
