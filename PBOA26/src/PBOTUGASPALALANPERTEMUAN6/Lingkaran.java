package PBOTUGASPALALANPERTEMUAN6;

public class Lingkaran extends BangunDatar {
    double jari;
    final float PI = 3.14f;
    
    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    public void hitungLuas() {
        this.luas = (int) (PI * jari * jari);
        this.keliling = (int) (2 * PI * jari);
    }
    
    public void info() {
        System.out.println("\nINFO LINGKARAN");
        System.out.println("Jari-jari : " + this.jari);
        System.out.println("LUAS      : " + super.luas);
        System.out.println("KELILING  : " + super.keliling);
    }
}