class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tampilkanData() {
        System.out.println(nim + " - " + nama);
    }
}

class KelasPraktikum {
    String namaKelas;
    Mahasiswa[] mahasiswa;

    KelasPraktikum(String namaKelas, Mahasiswa[] mahasiswa) {
        this.namaKelas = namaKelas;
        this.mahasiswa = mahasiswa;
    }

    void tampilkanKelas() {
        System.out.println("Kelas Praktikum : " + namaKelas);
        System.out.println("Daftar Mahasiswa : ");

        for(Mahasiswa m : mahasiswa) {
            m.tampilkanData();
        }
    }
}

public class PraktikAggregation {
    public static void main(String [] args) {
        Mahasiswa mhs1 = new Mahasiswa("Goklas Irvan Joshua Harianja", "125140175");
        Mahasiswa mhs2 = new Mahasiswa("Juan Praba Pradipta", "125140140");
        Mahasiswa mhs3 = new Mahasiswa("Caesar Qyalana Arysal", "125140186");

        Mahasiswa[] mhs = {mhs1, mhs2, mhs3};
        
        KelasPraktikum kelas = new KelasPraktikum("PBO", mhs);
        kelas.tampilkanKelas();
    }
}