package com.tutorial;

public class Front {
    public static void main(String[] args) {
        // membuat objek player
        Main ow = new Main();

        // mengisi atribut player
        ow.name = "Prasetya";
        ow.kecepatan = 78;
        ow.nyawa = 50;

        // menjalankan method
        ow.run();

        if(ow.Mati()){
            System.out.println(" Kamu Hebat !");
        }else {
            System.out.println("Kamu G A G A L !");
        }
    }
}
