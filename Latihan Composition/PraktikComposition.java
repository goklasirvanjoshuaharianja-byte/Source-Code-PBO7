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
    String namaKelas;
    JadwalPraktikum jadwal;

    KelasPraktikum(String namaKelas) {
        this.namaKelas = namaKelas;

        jadwal = new JadwalPraktikum("Rabu", "09.20");
    }

    void tampilkanInfoKelas() {
        System.out.println("Kelas Praktikum : " + namaKelas);
        jadwal.tampilkanJadwal();
    }
}

public class PraktikComposition {
    public static void main(String [] args) {
        KelasPraktikum kelas = new KelasPraktikum("RC - Pemrograman Berorientasi Objek");
        kelas.tampilkanInfoKelas();
    }
}

