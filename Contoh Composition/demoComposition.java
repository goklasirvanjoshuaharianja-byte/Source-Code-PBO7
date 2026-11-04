class RuangKelas {
    String namaRuang;

    RuangKelas(String namaRuang) {
        this.namaRuang = namaRuang;
    }

    void tampilkanRuang() {
        System.out.println("Ruang Kelas : " + namaRuang);
    }
}

class Gedung {
    String namaGedung;

    //Composition
    RuangKelas ruang1;
    RuangKelas ruang2;

    Gedung(String namaGedung) {
        this.namaGedung = namaGedung;

        ruang1 = new RuangKelas("Ruangan 201");
        ruang2 = new RuangKelas("Ruangan 113");
    }

    void tampilkanGedung() {
        System.out.println("Gedung : " + namaGedung);
        ruang1.tampilkanRuang();
        ruang2.tampilkanRuang();
    }
}

public class demoComposition {
    public static void main(String [] args) {
        Gedung gedung = new Gedung("Gedung Kuliah Umum 2");
        gedung.tampilkanGedung();
    }
}