package com.alohadevelop;

public class Main {

    public static void main(String[] args) {

        String nombre = "Mike";
        saludoPersonalizado(nombre);

        String hola = "Que pedo";
        String amigos = " cachorros como estan?";
        System.out.println(hola + amigos);


    }

    public static void saludoPersonalizado(String nombre){
        System.out.println("Hola " + nombre + "!");
    }
}
