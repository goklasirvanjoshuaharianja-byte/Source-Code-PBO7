class Mahasiswa {
    String nama;

    Mahasiswa(String nama) {
        this.nama = nama;
    }

    void tampilkanNama() {
        System.out.println("Mahasiswa : " + nama);
    }
}

class KelasPraktikum {
    String namaKelas;
    Mahasiswa[] daftarMahasiswa;

    KelasPraktikum(String namaKelas, Mahasiswa[] daftarMahasiswa) {
        this.namaKelas = namaKelas;
        this.daftarMahasiswa = daftarMahasiswa;
    }

    void tampilkanAnggotaKelas() {
        System.out.println("Kelas Praktikum : " + namaKelas);
        System.out.println("Daftar Mahasiswa : ");

        for(Mahasiswa mhs : daftarMahasiswa) {
            mhs.tampilkanNama();
        }
    }
}

public class demoAggregation {
    public static void main(String [] args) {
        Mahasiswa mhs1 = new Mahasiswa("Caesar");
        Mahasiswa mhs2 = new Mahasiswa("Juan");
        Mahasiswa mhs3 = new Mahasiswa("Joshua");

        Mahasiswa[] daftar = {mhs1, mhs2, mhs3};

        KelasPraktikum kelas = new KelasPraktikum("PBO IF-1", daftar);
        kelas.tampilkanAnggotaKelas();
    }
}