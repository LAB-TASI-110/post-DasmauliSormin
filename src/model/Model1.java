package model;


public class Model1 {
    public String kode;
    public String kota;
    public double hargaPerKg;
    public String kategori;

    public double beratButet; // tambahan

    public Model1(String kode, String kota, double hargaPerKg, String kategori, double beratButet) {
        this.kode = kode;
        this.kota = kota;
        this.hargaPerKg = hargaPerKg;
        this.kategori = kategori;
        this.beratButet = beratButet;
    }
}
