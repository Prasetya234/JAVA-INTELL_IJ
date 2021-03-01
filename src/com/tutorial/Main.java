package com.tutorial;

public class Main {
    // definisi atribut
    String name;
    int kecepatan;
    int nyawa;

    // definisi method run
    void run(){
        System.out.println(name +" Sedang memproses...");
        System.out.println("Kecepatan: "+ kecepatan);
    }

    // definisi method isDead untuk mengecek nilai Kondisi
    boolean Mati(){
        if(nyawa >= 40) return true;
        return false;
    }
}
