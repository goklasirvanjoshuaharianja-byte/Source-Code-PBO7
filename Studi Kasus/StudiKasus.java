class MataKuliah {
    String kode;
    String namaMataKuliah;

    MataKuliah(String kode, String namaMataKuliah) {
        this.kode = kode;
        this.namaMataKuliah = namaMataKuliah;
    }

    void tampilkanMataKuliah() {
        System.out.println(kode + " - " + namaMataKuliah);
    }
}

class Mahasiswa {
    String nama;
    String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tampilkanDataMahasiswa(MataKuliah[] mataKuliah) {
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Mata Kuliah   : ");
       for(MataKuliah mk : mataKuliah) {
        mk.tampilkanMataKuliah();
       }
    } 
}

class JadwalPraktikum {
    String hari;
    String jam;

    JadwalPraktikum(String hari, String jam) {
        this.hari = hari;
        this.jam = jam;
    }

    void tampilkanJadwal() {
        System.out.println("Hari : " + hari);
        System.out.println("Jam  : " + jam);
    }

}

class KelasPraktikum {
    Mahasiswa[] mahasiswa;
    MataKuliah[] mataKuliah;
    JadwalPraktikum jadwal;

    KelasPraktikum(MataKuliah[] mataKuliah, Mahasiswa[] mahasiswa) {
        this.mataKuliah = mataKuliah;
        this.mahasiswa = mahasiswa;
        jadwal = new JadwalPraktikum("Senin", "13.00");
    }

    void tampilkanInfoKelas() {
        System.out.println("Kelas Praktikum : ");
        for(MataKuliah mk : mataKuliah) {
            mk.tampilkanMataKuliah();
        }
        jadwal.tampilkanJadwal();
        System.out.println("\nDaftar Mahasiswa : ");

        for(Mahasiswa m : mahasiswa) {
            m.tampilkanDataMahasiswa(mataKuliah);
        }
    }
}

public class StudiKasus {
    public static void main(String[] args) {
        MataKuliah mk1 = new MataKuliah(
            "IF-001", "Pemrograman Berorientasi Objek"
        );

        MataKuliah mk2 = new MataKuliah(
            "IF-002", "Jaringan Komputer"
        );

        MataKuliah mk3 = new MataKuliah(
            "IF-003", "Basis Data"
        );

        Mahasiswa mhs1 = new Mahasiswa(
            "Goklas Irvan Joshua Harianja", "125140175"
        );

        Mahasiswa mhs2 = new Mahasiswa(
            "Juan Praba Pradipta", "125140140"
        );

        Mahasiswa mhs3 = new Mahasiswa(
            "Seysar Rizky Sujadi", "124140148"
        );

        Mahasiswa[] mhs = {mhs1, mhs2, mhs3};
        MataKuliah[] mk = {mk1, mk2, mk3};

        KelasPraktikum kelas = new KelasPraktikum(mk, mhs);

        kelas.tampilkanInfoKelas();
    }
}

