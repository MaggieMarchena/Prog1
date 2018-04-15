package practicaFinal;

public class recuSegundoParcial_Secuencias2 {
	final static int MAX1 = 40;
	final static int MAX2 = 7;
	
	public static void main(String[] args) {
		int[] ArrSec = {0,0,1,3,2,0,2,3,0,1,3,2,0,0,0,1,2,0,0,1,3,2,0,0,0,4,5,6,0,0,1,3,2,0,2,3,1,0,0,0};
		int[] Modelo = {1,3,2,0,0,0,0};
		int[] Reemplazo = {6,7,0,0,0,0,0};
		int Cant = 3;
		imprimirArreglo (ArrSec);
		reemplazarSecuencias (ArrSec, Modelo, Reemplazo, Cant);
//		invertirSecuencia (ArrSec);
		System.out.println("El arreglo después del cambio :");
		imprimirArreglo (ArrSec);
	}
	
	public static int buscarInicioSecuencia (int[]arr, int max, int pos){
		while ((pos < max) && (arr[pos] == 0)){
			pos++;
		}
		return pos;
	}
	
	public static int buscarLargoSecuencia (int[]arr, int max, int in){
		int pos = in;
		while ((pos < max) && (arr[pos] != 0)){
			pos++;
		}
		return pos - in;
	}
	
	public static void eliminarElemento (int[]arr, int pos){
		for (int i = pos; i < MAX1-1; i++){
			arr[i] = arr[i+1];
		}
		arr[MAX1-1] = 0;
	}
	
	public static void insertarElemento (int[]arr, int pos, int a){
		for (int i = MAX1-1; i > pos; i--){
			arr[i] = arr[i-1];
		}
		arr[pos] = a;
	}
	
	public static boolean compararSecuencias (int[]arrS, int[]arrM, int posS, int posM, int largo){
		boolean iguales = false;
		while ((posM < largo) && (arrS[posS] == arrM[posM])){
			posS++;
			posM++;
			iguales = true;
			if (arrS[posS] != arrM[posM]){
				iguales = false;
			}
		}
		return iguales;
	}
	
	public static void reemplazarSecuencias (int[]arrS, int[]arrM, int[]arrR, int cant){
		int contador = 0;
		int pos = 0;
		int inicioSecM = 0;
		int largoSecM = buscarLargoSecuencia (arrM, MAX2, inicioSecM);
		int inicioSecR = 0;
		int largoSecR = buscarLargoSecuencia (arrR, MAX2, inicioSecR);
		int finSecR = inicioSecR + largoSecR - 1;
		while (contador < cant){
			int inicioSec = buscarInicioSecuencia (arrS, MAX1, pos);
			int largoSec = buscarLargoSecuencia (arrS, MAX1, inicioSec);
			int finSec = inicioSec + largoSec - 1;
			if (largoSecM == largoSec){
				boolean iguales = compararSecuencias (arrS, arrM, inicioSec, inicioSecM, largoSecM);
				if (iguales == true){
					for (int i = inicioSec; i <= finSec; i++){
						eliminarElemento(arrS, inicioSec);
					}
					for (int j = finSecR; j >= inicioSecR; j--){
						int a = arrR[j];
						insertarElemento (arrS, inicioSec, a);
					}
					contador++;
				}
			}
			pos = inicioSec + largoSecR; 
		}
	}

	public static void imprimirArreglo (int[]arr){
		for (int i = 0; i < MAX1; i++){
			System.out.print(" " + arr[i]);
		}
		System.out.println("");
	}
	
	public static int buscarPosMayor (int[]arr){
		int mayor = 0;
		int pos = 0;
		for (int i = 0; i < MAX1; i++){
			if (arr[i] > mayor){
				mayor = arr[i];
				pos = i;
			}
		}
		return pos;
	}
	
	public static void invertirSecuencia (int[]arr){
		int pos = buscarPosMayor (arr);
		while ((pos > 0) && (arr[pos] != 0)){
			pos--;
		}
		int inicioSec = pos + 1;
		int largoSec = buscarLargoSecuencia (arr, MAX1, inicioSec);
		int posMedia = inicioSec + Math.floorDiv(largoSec, 2);
		int finSec = inicioSec + largoSec - 1;
		int aux = 0;
		for (int i = inicioSec; i <= posMedia; i++){
			int valor = arr[i];
			arr[i] = arr[finSec-aux];
			arr[finSec-aux] = valor;
			aux++;
		}
	}
}

