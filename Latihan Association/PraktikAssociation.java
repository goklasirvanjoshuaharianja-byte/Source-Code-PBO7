class MataKuliah {
    String kode;
    String nama;

    MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }
}

class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tampilkanDataMahasiswa(MataKuliah mk) {
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Mata Kuliah : " + mk.kode + " - " + mk.nama);
    }
}

public class PraktikAssociation {
    public static void main(String [] args) {
        Mahasiswa mhs = new Mahasiswa("Goklas Irvan Joshua Harianja", "125140175");
        MataKuliah mk = new MataKuliah("IF-001", "Pemrograman Berorientasi Objek");

        mhs.tampilkanDataMahasiswa(mk);
    }
}