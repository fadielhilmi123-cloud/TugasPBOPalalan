package PBO6;

public class Employee {
    int nip;
    String nama;
    long gaji;
    
    public void Employee(int nip, String nama, long gaji){
      this.nip = nip;
      this.nama = nama;
      this.gaji = gaji;
      }
    public void info(){
        System.out.println("===== INFO EMPLOYEE =======");
        System.out.println("NIP : " + nip);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : " + gaji);

    }
}
