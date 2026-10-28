package PBOTUGASPALALANPERTEMUAN6;

public class PersegiPanjang extends BangunDatar {
    int panjang;
    int lebar;
    
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void hitungPersegiPanjang() {
        this.luas = panjang * lebar;
        this.keliling = 2 * (panjang + lebar);
    }
    
    public void info() {
        System.out.println("\nINFO PERSEGI PANJANG");
        System.out.println("Panjang  : " + this.panjang);
        System.out.println("Lebar    : " + this.lebar);
        System.out.println("LUAS     : " + super.luas);
        System.out.println("KELILING : " + super.keliling);
    }
}