package model;

public class Model2 {
    private String kategori;
    private int stok;

    public Model2(String kategori, int stok) {
        this.kategori = kategori.toUpperCase();
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }
}
