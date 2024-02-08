package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String nombreJugadorUNo;
        String nombreJugadorDos;
        String opcionUno = "piedra";
        String opcionDos = "papel";
        String opcionTres = "tijera";
        String eleccionDelJugador;

        Scanner leerDato = new Scanner(System.in);

        System.out.println("*********************");
        System.out.println("Bienvendio al mejor juego del mundo");
        System.out.println("*********************");
        System.out.print("ingresa el nombre del jugador numero uno: ");
        nombreJugadorUNo = leerDato.nextLine();
        System.out.print("Muy bien ingresa el nombre de tu oponente: ");
        nombreJugadorDos = leerDato.nextLine();

        System.out.print("jugador uno elija piedra papel o tijera: ");
        leerDato.nextLine().toLowerCase();

        System.out.print("Jugador dos elija piedra papel o tijera: ");
        leerDato.nextLine().toLowerCase();

        if (nombreJugadorUNo.equals(nombreJugadorDos)) {
            System.out.println("empate");
        } else if
        ((nombreJugadorUNo.equals(opcionUno) &&
                        nombreJugadorDos.equals(opcionTres)) ||

                        (nombreJugadorUNo.equals(opcionDos) &&
                                nombreJugadorDos.equals(opcionUno)) ||

                        (nombreJugadorUNo.equals(opcionTres) &&
                                nombreJugadorDos.equals(opcionDos))) {
            System.out.println("el jugador uno es el ganador");

        }else {
            System.out.println("Jugador dos es el ganador ");
        }

        System.out.println("FIN DEL JUEGO GRACIAS POR PARTICIPAR");


    }
}