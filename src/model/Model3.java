
package model;

public class Model3 {
    private String namaMenu;
    private int harga;
    private int jumlah;

    public Model3(String namaMenu, int harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = 0;
    }

    public Model3(String namaMenu, int harga, int jumlah) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public String getNamaMenu() { return namaMenu; }
    public int getHarga() { return harga; }
    public int getJumlah() { return jumlah; }
    public int getSubtotal() { return harga * jumlah; }
}
