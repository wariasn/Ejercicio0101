/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_01;

/**
 *
 * @author Walter
 */
public class Ejercicio_01_01 {

    public static void main(String[] args) {
        
        var compuMia = new Computadora();
        compuMia.marca = "Asus";
        compuMia.año = 2017;
        compuMia.color = "Negro";
        compuMia.sistemaOperativo = "Windows 10";
        
        System.out.println("La marca de mi computadora es: "+compuMia.marca);
        System.out.println("El año de mi computadora es: "+compuMia.año);
        System.out.println("El color de mi computadora es: "+compuMia.color);
        System.out.println("El sistema operativo de mi computadora es: "+compuMia.sistemaOperativo);
        
        var compuHermano = new Computadora();
        compuHermano.marca = "Toshiba";
        compuHermano.año = 2018;
        compuHermano.color = "Gris";
        compuHermano.sistemaOperativo = "Windows 10";
        
        System.out.println("\nLa marca de la computadora de mi hermano es: "+compuHermano.marca);
        System.out.println("El año de la computadora de mi hermano es: "+compuHermano.año);
        System.out.println("El color de la computadora de mi hermano es: "+compuHermano.color);
        System.out.println("El sistema operativo de la computadora de mi hermano es: "+compuHermano.sistemaOperativo);
        
        var moto1 = new Motocicleta();
        moto1.marca = "Ducati";
        moto1.color = "Rojo";
        moto1.peso = "160 Kg";
        moto1.km = "2.500 Km";
        
        System.out.println("\nLa marca de la moto1 es: "+moto1.marca);
        System.out.println("El color de la moto1 es: "+moto1.color);
        System.out.println("El peso de la moto1 es: "+moto1.peso);
        System.out.println("El Kilometraje de la moto1 es: "+moto1.km);
        
        var moto2 = new Motocicleta();
        moto2.marca = "Kawasaki";
        moto2.color = "Naranja";
        moto2.peso = "206 Kg";
        moto2.km = "35.000 Km";
        
        System.out.println("\nLa marca de la moto2 es: "+moto2.marca);
        System.out.println("El color de la moto2 es: "+moto2.color);
        System.out.println("El peso de la moto2 es: "+moto2.peso);
        System.out.println("El kilometraje de la moto2 es: "+moto2.km);
        
        var casaVecino = new Casa();
        casaVecino.numPisos = 2;
        casaVecino.color = "Amarillo";
        casaVecino.numDormitorio = 5;
        casaVecino.techo = "Tejas naranjas";
        
        System.out.println("\nNumero de pisos de la casa del vecino son: "+casaVecino.numPisos);
        System.out.println("Color de la casa del vecino es: "+casaVecino.color);
        System.out.println("Numero de dormitorios de la casa del vecino son: "+casaVecino.numDormitorio);
        System.out.println("El techo de la casa del vecino es: "+casaVecino.techo);
        
        var casaTia = new Casa();
        casaTia.numPisos = 2;
        casaTia.color = "Blanco";
        casaTia.numDormitorio = 4;
        casaTia.techo = "Tejas azules";
        
        System.out.println("\nNumero de pisos de la casa de la Tia son: "+casaTia.numPisos);
        System.out.println("Color de la casa de la Tia es: "+casaTia.color);
        System.out.println("Numero de dormitorios de la casa de la Tia son: "+casaTia.numDormitorio);
        System.out.println("El techo de la casa de la Tia es: "+casaTia.techo);
        
        var jugador1 = new Jugador();
        jugador1.nombre = "Diego";
        jugador1.nacionalidad = "Uruguayo";
        jugador1.numCamiseta = 10;
        jugador1.posicion = "Delantero";
        
        System.out.println("\nNombre del Jugador1 es: "+jugador1.nombre);
        System.out.println("Nacionalidad del Jugador1 es: "+jugador1.nacionalidad);
        System.out.println("Numero de camiseta del Jugador1 es: "+jugador1.numCamiseta);
        System.out.println("Posición del Jugador1 es: "+jugador1.posicion);
        
        var jugador2 = new Jugador();
        jugador2.nombre = "Antonio";
        jugador2.nacionalidad = "Ecuatoriano";
        jugador2.numCamiseta = 25;
        jugador2.posicion = "Lateral Derecho";
        
        System.out.println("\nNombre del Jugador2 es: "+jugador2.nombre);
        System.out.println("Nacionalidad del Jugador2 es: "+jugador2.nacionalidad);
        System.out.println("Numero de camiseta del Jugador2 es: "+jugador2.numCamiseta);
        System.out.println("Posición del Jugador2 es: "+jugador2.posicion);
        
        var libro1 = new Libro();
        libro1.autor = "Victor Hugo";
        libro1.titulo = "Los Miserables";
        libro1.numSerie = 1833902212;
        libro1.costo = 27;
        
        System.out.println("\nEl autor del libro1 es: "+libro1.autor);
        System.out.println("El título del libro1 es: "+libro1.titulo);
        System.out.println("El numero de serie del libro1 es: "+libro1.numSerie);
        System.out.println("El costo del libro1 es: "+libro1.costo);
        
        var libro2 = new Libro();
        libro2.autor = "Grabiel García Márquez";
        libro2.titulo = "Cien años de soledad";
        libro2.numSerie = 1957385892;
        libro2.costo = 10;
        
        System.out.println("\nEl autor del libro2 es: "+libro2.autor);
        System.out.println("El título del libro2 es: "+libro2.titulo);
        System.out.println("El numero de serie del libro2 es: "+libro2.numSerie);
        System.out.println("El costo del libro2 es: "+libro2.costo);
        
    }
}
