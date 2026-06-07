package bagian3.perpustakaan;

/**
 *
 */
public class MainPerpustakaan {

    public static void main(String[] args) {
        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();
        
        // Membuat objek Buku lalu memasukkannya ke koleksi (dengan tahun terbit)
        perpus.tambahBuku(new Buku("Antiparallel", "Helen", 2004));
        perpus.tambahBuku(new Buku("Dawnforger", "Loreley", 2005));
        perpus.tambahBuku(new Buku("Chiral Redudancy", "Groza", 2006));
        perpus.tambahBuku(new Buku("Amidst Wings of Gray", "Daiyan", 2007)); // Tambahan untuk tes cariPenulis
        
        perpus.tampilkanKoleksi();
        System.out.println();
        
        // Pengujian fitur Pinjam Buku
        perpus.pinjamBuku("Antiparallel");
        perpus.pinjamBuku("Antiparallel"); // coba pinjam kedua kali
        System.out.println();
        
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian Tugas 1: Kembalikan Buku
        System.out.println("== Pengujian Kembalikan Buku ==");
        perpus.kembalikanBuku("Antiparallel");
        perpus.tampilkanKoleksi();
        System.out.println("Buku tersedia setelah dikembalikan: " + perpus.jumlahTersedia());
        System.out.println();
        
        // Pengujian Tugas 3: Cari Penulis
        perpus.cariPenulis("Helen");
        System.out.println();
        perpus.cariPenulis("Tololo"); // Tes jika penulis tidak ditemukan
    }
}