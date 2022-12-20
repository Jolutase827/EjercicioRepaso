package es.ieslavereda.ejercicio1;

import es.ieslavereda.ejercicio5.Fraccion;

public class Main {
    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(2,3);
        Fraccion fraccion2 = new Fraccion(3,2);
        System.out.println(fraccion2.dividir(fraccion1));
        System.out.println();
        System.out.println(fraccion1.restar(fraccion2));
        System.out.println();
        System.out.println(fraccion1.multiplicar(fraccion2));
        System.out.println();
        System.out.println(fraccion1.sumar(fraccion2));
    }
}