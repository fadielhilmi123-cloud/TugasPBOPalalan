package PBO04;

public class MainClass {
    public static void main(String[] args) {
        
        // CARA MEMBUAT OBJECT : Nama_Kelas namaObject = new Constructor
        Lingkaran lingkaranSatu = new Lingkaran();
        
        //Lingkaran = Nama_Kelas 
        //lingkaranSatu = namaObject 
        //new Lingkaran() = new 
        //Gunanya Constructor adalah memberi nilai awal
        
        System.out.println("OBJECT LINGKARAN SATU SUCCEED");
        System.out.println("Jari-Jari Lingkaran Satu = "+ lingkaranSatu.jari);
        System.out.println("PHI Lingkaran Satu = "+ lingkaranSatu.phi);
        System.out.println("Luas Lingkaran Satu = "+ lingkaranSatu.luas);
        
        Lingkaran lingkaranDua = new Lingkaran();  
        lingkaranDua.jari = 7;
        System.out.println("\nOBJECT LINGKARAN DUA SUCCEED");
        System.out.println("Jari-Jari Lingkaran Dua = "+ lingkaranDua.jari);
        System.out.println("PHI Lingkaran Dua = "+ lingkaranDua.phi);
        System.out.println("Luas Lingkaran Dua = "+ lingkaranDua.hitungLuas());
        System.out.println("Luas Lingkaran Satu = "+ lingkaranSatu.hitungLuas());

        Tabung tabungSatu = new Tabung();
        System.out.println("\n OBJECT TABUNG SUCCEED");
        System.out.println("\n Jari Jari Tabung : "+ tabungSatu.jari);
        System.out.println("\n Tinggi Tabung : "+ tabungSatu.tinggi);
        System.out.println("\n PHI Tabung : "+ tabungSatu.phi);
        System.out.println("\n Volume Tabung Satu "+ tabungSatu.hitungVolume());

    }
  
}
class Lingkaran{
    //PROPERTIES 
    double jari;
    double luas;
    final double phi = 3.14;

    public double hitungLuas(){
        luas = phi * jari * jari;
        return luas;
}
}

class Tabung{
    double jari;
    double volume;
    double tinggi;
    final double phi = 3.14;
    
 public double hitungVolume(){
     volume =  phi * jari * jari * tinggi;
     return volume; 
 }
     
}

