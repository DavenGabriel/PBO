package Praktikum7;

public class p_panjang extends bangun_datar {
    private double luasP;
    
    p_panjang(double pX, double lX, double aX, double tX){
        super(pX, lX, aX, tX);
        
    }
    
    public void viewp_panjang() {
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : " + lebar);
    }
    
    double luasP(){
        double luasP = panjang * lebar; 
        System.out.println("Luas Persegi Panjang:" + luasP);
        return luasP;
    }
}
