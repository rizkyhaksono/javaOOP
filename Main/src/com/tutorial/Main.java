package com.tutorial;

class Mahasiswa{
    // String nama = "Rizky Haksono";
    String nama;

    // Constructor dipanggil saat obj pertama kali dibuat
    Mahasiswa(){
        System.out.println("Nama saya " + nama);
    }

    Mahasiswa(String inputNama){
        nama = inputNama;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {        
        Mahasiswa mhs = new Mahasiswa("Rizky Haksono");
        System.out.println(mhs.nama);

        // new Mahasiswa();
        // System.out.println(mhs.nama);
    }
}