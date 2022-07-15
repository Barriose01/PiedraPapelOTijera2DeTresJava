//-------------------------PLANTILLA PPT 2 De 3-------------------------\\
// 28/10/2021
// Santiago, Chile
// Eddie Casañas
// PYTHON PORT
//------------------------------------------------------------------\\

import java.util.*;

public class PlantillaPiedraPapelTijera2 {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	String pc;
	String usuario;
	int puntosUsuario = 0;
	int puntosMaquina = 0;
	int[] puntuacion = new int[2];
	private String getOpcion() {
		int numero;
		String opcion = "";
		numero = rd.nextInt(3);
		if(numero == 0) {
			opcion = "piedra";
		}else if(numero == 1) {
			opcion = "papel";
		}else if(numero == 2) {
			opcion = "tijera";
		}
		return opcion;
	}
	private void empate(String usuario, String pc) {
		System.out.println("\nJUGADOR: " + usuario);
		System.out.println("MAQUINA: " + pc);
		System.out.println("EMPATE");
	}
	private void victoria(String usuario, String pc) {
		System.out.println("\nJUGADOR: " + usuario);
		System.out.println("MAQUINA: " + pc);
		System.out.println("GANASTE");
	}
	private void perdida(String usuario, String pc) {
		System.out.println("\nJUGADOR: " + usuario);
		System.out.println("MAQUINA: " + pc);
		System.out.println("PERDISTE");
	}
	protected int[] piedra() {
		usuario = "piedra";
		pc = this.getOpcion();
		if(usuario == pc) {
			this.empate(usuario, pc);
		}else if(pc == "papel") {
			this.perdida(usuario, pc);
			puntosMaquina += 1;
		}else if(pc == "tijera") {
			this.victoria(usuario, pc);
			puntosUsuario += 1;
		}
		puntuacion[0] = puntosUsuario;
		puntuacion[1] = puntosMaquina;
		
		return puntuacion;
		
	}
	protected int[] papel() {
		usuario = "papel";
		pc = this.getOpcion();
		if(usuario == pc) {
			this.empate(usuario, pc);
		}else if(pc == "tijera") {
			this.perdida(usuario, pc);
			puntosMaquina += 1;
		}else if(pc == "piedra") {
			this.victoria(usuario, pc);
			puntosUsuario += 1;
		}
		puntuacion[0] = puntosUsuario;
		puntuacion[1] = puntosMaquina;
		return puntuacion;
	}
	protected int[] tijera() {
		usuario = "tijera";
		pc = this.getOpcion();
		if(usuario == pc) {
			this.empate(usuario, pc);
		}else if(pc == "piedra") {
			this.perdida(usuario, pc);
			puntosMaquina += 1;
		}else if(pc == "papel") {
			this.victoria(usuario, pc);
			puntosUsuario += 1;
		}
		puntuacion[0] = puntosUsuario;
		puntuacion[1] = puntosMaquina;
		return puntuacion;
	}
	protected int salida() {
		int salida = 1;
		return salida;
	}
	protected int repetir() {
		String opcionRepetir;
		int parseRepetir, salidaRepetir;
			while(true) {
				System.out.println("(1): Volver a jugar");
				System.out.println("(2): Salir");
				try {
					opcionRepetir = sc.nextLine();
					parseRepetir = Integer.parseInt(opcionRepetir);
				}catch(Throwable exc) {
					System.out.println("Ingrese una opcion valida");
					continue;
				}
				if(parseRepetir < 1 || parseRepetir > 2) {
					System.out.println("Ingrese una opcion valida");
				}else {
					if(parseRepetir == 1) {
						salidaRepetir = 0;
						puntosUsuario = 0;
						puntosMaquina = 0;
						break;
					}else if(parseRepetir == 2) {
						salidaRepetir = 1;
						break;
					}
				}
			}
			return salidaRepetir;

	}

}
