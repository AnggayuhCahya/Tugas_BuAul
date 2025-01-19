package TugasBuAul;
import java.util.Scanner;

public class ran{
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        siswa s = new siswa();
       
        System.out.println("Masukkan Nama anda : ");
        String nama = input.nextLine();
        s.setNama(nama);
        
        System.out.println("Masukkan Umur anda : ");
        int usia = input.nextInt();
        s.setUsia(usia);
        
        System.out.println("Berapakah Nilai anda ? ");
        double nilai = input.nextDouble();
        s.setNilai(nilai);
        
        System.out.println("=== Data Siswa ===");
        System.out.println("Nama  : " + s.getNama());
        System.out.println("Usia  : " + s.getUsia());
        System.out.println("Nilai : " + s.getNilai());

        input.close();
        
    }
}