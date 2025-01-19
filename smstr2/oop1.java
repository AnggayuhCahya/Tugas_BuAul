package smstr2;

public class oop1 {    
    private String nama= "Anggayuh Cahyaning Utami";
            char jk;;
    
        // asesor methods
        public String berNama(){
            return nama;
        }

        // mutator methods
        public void setNama(String namaIsi){
            nama=namaIsi;
    }

    public oop1(){
        nama="Cahya";
        jk='p';
    }

    void panggilNama(){
        System.out.println(nama);
    } 
    void tampilJk(){
        System.out.println(jk);
    }

    public String getNama(){
        return nama;
    }
}
