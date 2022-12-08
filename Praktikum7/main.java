package Praktikum7;

public class main {
    public static void main(String[] args) {
        p_panjang p = new p_panjang(7, 7, 0, 0);
        segitiga s = new segitiga(0, 0, 10, 10);
        
        p.viewp_panjang();
        p.luasP();
        s.viewsegitiga();
        s.luasS();
    }
}

// Menggunakan Method Inheritance