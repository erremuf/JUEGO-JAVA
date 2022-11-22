package com.aepi;

import java.util.Scanner;

public class CreandoJuego {

	public static void main(String[] args) {

		Juego juego = new Juego(3); 

		int numJugador;
		int numAleatorio = (int) (Math.random() * 10 + 1);
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nADIVINA EN QUÉ NÚMERO ESTOY PENSANDO \n");
		do {
			System.out.println("Escribe un número del 1 al 10");
			numJugador = scanner.nextInt();
			juego.muestraVidasRestantes(numJugador, numAleatorio);
			// System.out.println(juego.vidasActuales());
		} while (juego.vidasActuales() > 0);

	}

}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////


class Juego {

	int vidas;

	public Juego() {
	}

	public Juego(int vidas) {
		this.vidas = vidas;
	}

	public void muestraVidasRestantes(int numJugador, int numAleatorio) {		
			if (numJugador == numAleatorio) {
				System.out.println("\n¡¡HAS GANADO!!");
			} else {
				this.vidasRestantes();
				System.out.println("\n¡No es ese! Te quedan " + vidas + " vidas.");
			}
	}

	public int vidasRestantes() {
		--vidas;
		return vidas;
	}

	public int vidasActuales() {
		return vidas;
	}

}
