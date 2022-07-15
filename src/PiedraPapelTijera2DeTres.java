//-------------------------PPT 2 De 3-----------------------------\\
// 28/10/2021
// Santiago, Chile
// Eddie Casañas
// PYTHON PORT
//------------------------------------------------------------------\\


import java.util.*;

public class PiedraPapelTijera2DeTres {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PlantillaPiedraPapelTijera2 obj = new PlantillaPiedraPapelTijera2();
		int salida = 0;
		String opcion;
		int parseOpcion;
		int[] puntuacion = new int[2];
		int puntosUsuario = 0;
		int puntosMaquina = 0;
		String ganador;
		while(salida == 0) {
			while(true) {
				System.out.println("\n(1): Piedra");
				System.out.println("(2): Papel");
				System.out.println("(3): Tijera");
				System.out.println("(4): Salir");
				try {
					opcion = sc.nextLine();
					parseOpcion = Integer.parseInt(opcion);
					if(parseOpcion < 1 || parseOpcion > 4) {
						System.out.println("Ingrese una opcion valida");
						continue;
					}else {
						break;
					}
				}catch(Throwable exc) {
					System.out.println("Ingrese una opcion valida");
					continue;
				}
				
			}
			switch(parseOpcion) {
			case 1:
				puntuacion = obj.piedra();
				puntosUsuario = puntuacion[0];
				puntosMaquina = puntuacion[1];
				break;
			case 2:
				puntuacion = obj.papel();
				puntosUsuario = puntuacion[0];
				puntosMaquina = puntuacion[1];
				break;
			case 3:
				puntuacion = obj.tijera();
				puntosUsuario = puntuacion[0];
				puntosMaquina = puntuacion[1];
				break;
			case 4:
				salida = obj.salida();
				break;
			}
			if(puntosUsuario == 2 || puntosMaquina == 2) {
				if(puntosUsuario > puntosMaquina) {
					ganador = "USUARIO";
				}else {
					ganador = "MAQUINA";
				}
				System.out.println("\nEL GANADOR ES: " + ganador + "\n");
				salida = obj.repetir();
				puntosUsuario = 0;
				puntosMaquina = 0;
			}else {
				continue;
			}
			
		}
		sc.close();
	}
}

