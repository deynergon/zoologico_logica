package org.example;

public class Zoologico {
    public static void main(String[] args) {


        Animal animal1 = new Animal();
        animal1.nombre = "Cebra";
        animal1.genero = "F";


        Animal animal2 = new Animal();
        animal2.nombre="Caballo";
        animal2.genero="M";


        animal1.encontrarPareja(animal2);


        Familia familia = new Familia(animal2, animal1);


        familia.tenerHijo("Cebrallo");

        familia.imprimirFamilia();




    }
}