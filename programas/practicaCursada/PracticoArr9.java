package practicaCursada;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PracticoArr9 {
	final static int MAX = 10;

	public static void main(String[] args) {
		//int[]Arreglo = new int [MAX];
		//cargarArreglo(Arreglo);
		int[]Arreglo = {0,0,1,6,2,0,1,2,0,5};
		imprimirArreglo(Arreglo);
		int inicioSecMayor = buscarInicioSecuenciaMayor(Arreglo);
		System.out.println("La secuencia mayor empieza en : " + inicioSecMayor);
	}

	public static int obtenerEntero(){
		int a = 0;
		boolean enteroValido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese el valor :");
				a = new Integer (entrada.readLine());
				enteroValido = true;
			}
			catch(NumberFormatException e){
				System.out.println("Entero no válido");
				enteroValido = false;
			}
			catch(Exception exc){
				System.out.println(exc);
				enteroValido = false;
			}
		}
		while (!(enteroValido));
		return a;
	}
	
	public static void cargarArreglo(int[]arr){
		for (int i = 0; i < MAX; i++){
			arr[i] = obtenerEntero();
		}
	}
	
	public static void imprimirArreglo(int[]arr){
		System.out.println("El arreglo es :");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
	}
	
	public static int buscarInicioSecuencia (int[]arr, int p){
		while ((p < MAX) && (arr[p] == 0)){
			p++;
		}
		if ((p < MAX) && (arr[p] != 0)){
			return p;
		}
		else {
			return -1;
		}
	}
	
	public static int buscarLargoSecuencia (int[]arr, int in){
		int pos = in;
		while ((pos < MAX) && (arr[pos] != 0)){
			pos++;
		}
		return pos - in;
	}
	
	public static int buscarInicioSecuenciaMayor(int[]arr){
		int inicio = 0;
		int posicion = 0;
		int secuenciaMayor = 1;
		while (posicion < MAX){
			int inicioSecuencia = buscarInicioSecuencia(arr, posicion);
			if (inicioSecuencia != -1){
				int largoSecuencia = buscarLargoSecuencia(arr, inicioSecuencia);
				if (largoSecuencia > secuenciaMayor){
					secuenciaMayor = largoSecuencia;
					inicio = inicioSecuencia;
				}
			posicion = inicioSecuencia + largoSecuencia - 1;
			}
			posicion++;
		}
		return inicio;
	}
	
}
