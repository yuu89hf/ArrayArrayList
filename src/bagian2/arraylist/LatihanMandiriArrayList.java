/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;
import java.util.ArrayList;

/**
 *
 * @author weixi
 */
public class LatihanMandiriArrayList {
       public static void main(String[] args) {
//1. Buat ArrayList<String> daftar belanja. Tambah 4 item, lalu hapus item ke-2,
//lalu tampilkan isi list beserta jumlah akhirnya
            ArrayList<String>daftar_belanja = new ArrayList<>();
            daftar_belanja.add("DSR-50");
            daftar_belanja.add("IWS 2000");
            daftar_belanja.add("DP-12");
            daftar_belanja.add("Springfield");
            
            System.out.println("Isi list : " + daftar_belanja);
            daftar_belanja.remove("IWS 2000");
            System.out.println("Isi list : " + daftar_belanja);
            System.out.println();
            
//2. Buat ArrayList<Integer> berisi 5 angka. Tampilkan nilai terbesar dengan
//menelusuri seluruh elemen.
            ArrayList<Integer> angka = new ArrayList<>();
            angka.add(80);
            angka.add(75);
            angka.add(90);
            angka.add(85);
            angka.add(70);
            
            int max = angka.get(0);
            //buat susunan dari ArrayList angka dari awal (yg add, bukan nilai add)
            for (int i = 0; i < angka.size(); i++) {
                
                //buat var. angkaNow yang mengambil nilai dari list angka.add
                //(bingung? sama aku juga)(kidding, maksudnya nilai angka 80 yg ada di list pertama)
                int angkaNow = angka.get(i);
                
                if (angkaNow > max) {
                    //update var. max jadi angkaNow
                    max = angkaNow;
                }
            }
            System.out.println("Nilai max: " + max);
            System.out.println();
            
//3. Buat program yang menambah 6 nama ke dalam ArrayList, lalu cetak hanya
//nama yang diawali huruf A (gunakan method startsWith pada String).            
            ArrayList<String>name = new ArrayList<>();
            name.add("Alyunid");
            name.add("Solonli");
            name.add("Arai");
            name.add("Einherjar");
            name.add("Götterdämmerung");
            name.add("Ascii");
            
            for (int i = 0; i < name.size(); i++){
                
                String nameShow = name.get(i);
                if (nameShow.startsWith("A")){
                    System.out.println(nameShow);
                }
            }
    } 
}
