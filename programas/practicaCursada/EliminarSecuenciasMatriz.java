package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EliminarSecuenciasMatriz {
	final static int MAXFILAS = 3;
	final static int MAXCOLUMNAS = 5;

	public static void main(String[] args) {
		int M[][] = new int[MAXFILAS][MAXCOLUMNAS];
		cargarMatriz(M);
		imprimirMatriz(M);
		System.out.println("Tamaño que debe tener la sub-secuencia para borrarla");
		int N = obtenerEntero();
		eliminarSecuenciaEnMatriz(M, N);
		imprimirMatriz(M);
	}

	public static void cargarMatriz(int[][] mat) {
		for (int i = 0; i < MAXFILAS; i++) {
			System.out.println("Fila " + i);
			for (int j = 0; j < MAXCOLUMNAS; j++) {
				System.out.println("Posición " + j);
				mat[i][j] = obtenerEntero();
			}
		}
	}

	public static void imprimirMatriz(int[][] mat) {
		System.out.println("Los datos son :");
		for (int i = 0; i < MAXFILAS; i++) {
			for (int j = 0; j < MAXCOLUMNAS; j++) {
				System.out.print(" " + mat[i][j]);
			}
			System.out.println("");
		}
	}

	public static int obtenerEntero() {
		int a = 0;
		boolean enteroValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese el valor :");
				a = new Integer(entrada.readLine());
				enteroValido = true;
			} catch (NumberFormatException e) {
				System.out.println("Número no válido");
				enteroValido = false;
			} catch (Exception exc) {
				System.out.println(exc);
				enteroValido = false;
			}
		} while (!(enteroValido));
		return a;
	}

	public static int buscarInicioSecuencia(int[][] mat, int f, int c) {
		while ((c < MAXCOLUMNAS) && (mat[f][c] == 0)) {
			c++;
		}
		if ((c < MAXCOLUMNAS) && (mat[f][c] != 0)) {
			return c;
		} else {
			return -1;
		}
	}

	public static int buscarLargoSecuencia(int[][] mat, int f, int in) {
		int col = in;
		while ((col < MAXCOLUMNAS) && (mat[f][col] != 0)) {
			col++;
		}
		return col-in;
	}

	public static void eliminarElemento(int[][] mat, int f, int c) {
		for (int i = c; i < MAXCOLUMNAS - 1; i++) {
			mat[f][i] = mat[f][i + 1];
		}
		mat[f][MAXCOLUMNAS - 1] = 0;
	}

	public static void eliminarSecuenciaEnMatriz(int[][] mat, int n) {
		int fil = 0;
		while (fil < MAXFILAS) {
			int col = 0;
			while (col < MAXCOLUMNAS) {
				int inicioSec = buscarInicioSecuencia(mat, fil, col);
				if (inicioSec != -1){
					int largoSec = buscarLargoSecuencia(mat, fil, inicioSec);
					int finalSec = inicioSec + largoSec - 1;
					if (largoSec == n) {
						for (int i = inicioSec; i <= finalSec; i++) {
							eliminarElemento(mat, fil, inicioSec);
						}
					} else {
						col = finalSec;
					}
				}
				col++;
			}
			fil++;
		}
	}

}
