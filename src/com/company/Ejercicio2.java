package com.company;

public class Ejercicio2 {
    public static void main(String[] args) {
        //declaracion de variables
        Coche micoche = new Coche();
        micoche.incrementar();
        micoche.incrementar();
        System.out.println(micoche.numeroPuertas);
    }
}
class Coche{
    public int numeroPuertas =0;

    public void incrementar(){
        this.numeroPuertas++;
    }
}
