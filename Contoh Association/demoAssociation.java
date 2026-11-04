class MataKuliah {
    String namaMataKuliah;

    MataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    void tampilkanMataKuliah() {
        System.out.println("Mata Kuliah : " + namaMataKuliah);
    }
} 

class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    void ambilMataKuliah(MataKuliah mk) {
        System.out.println(nama + " mengambil mata kuliah " + mk.namaMataKuliah);
    }
}

public class demoAssociation {
    public static void main(String [] args) {
        Mahasiswa mhs = new Mahasiswa("Andi");
        MataKuliah mk = new MataKuliah("Pemrograman Berorientasi Objek");

        mhs.ambilMataKuliah(mk);
    }
}