package practicaFinal;

public class recuSegundoParcial_Secuencias {
	final static int MAX1 = 40;
	final static int MAX2 = 7;

	public static void main(String[] args) {
		int[] ArrSec = {0,0,1,3,2,0,2,3,0,1,3,2,0,0,0,1,2,0,0,1,3,2,0,0,0,4,5,6,0,0,1,3,2,0,2,3,1,0,0,0};
		int[] Modelo = {1,3,2,0,0,0,0};
		int[] Reemplazo = {6,7,0,0,0,0,0};
		int Cant = 3;
		resolverOperaciones(ArrSec, Modelo, Reemplazo, Cant);
		System.out.println("El arreglo después del reemplazo");
		imprimirArreglo(ArrSec);
	}
	
	public static int buscarInicioSecuencia (int[]arr, int max, int pos){
		while ((pos < max) && (arr[pos] == 0)){
			pos++;
		}
		return pos;
	}
	
	public static int buscarLargoSecuencia (int[]arr, int in, int max){
		int pos = in;
		while ((pos < max) && (arr[pos] != 0)){
			pos++;
		}
		return pos - in;
	}
	
	public static void eliminarElemento (int[]arr, int pos){
		for (int i = pos; i < MAX1 - 1; i++){
			arr[i] = arr[i+1];
		}
		arr[MAX1 - 1] = 0;
	}
	
	public static void insertarElemento (int[]arr, int pos, int a){
		for (int i = MAX1 - 1; i > pos; i--){
			arr[i] = arr[i-1];
		}
		arr[pos] = a;
	}
	
	public static void reemplazarSecuencias (int[]arrS, int[]arrR, int largo, int cant){
		int pos = 0;
		int inicioSecR = 0;
		int largoSecR = buscarLargoSecuencia(arrR, inicioSecR, MAX1);
		int finSecR = inicioSecR + largoSecR - 1;
		for (int i = 0; i <= cant; i++){
			int inicioSec = buscarInicioSecuencia(arrS, MAX1, pos);
			int finSec = inicioSec + largo - 1;
			for (int j = inicioSec; j <= finSec; j++){
				eliminarElemento(arrS, j);
			}
			for (int k = inicioSecR; k <= finSecR; k++){
				int a = arrR[k];
				insertarElemento (arrS, inicioSec, a);
			}
			pos = inicioSec + largoSecR - 1;
		}
	}
	
	public static boolean compararSecuencias (int[]arrS, int[]arrM, int in, int fin, int largo){
		boolean iguales = false;
		for (int i = 0; i < largo; i++){
			if (arrS[in+i] == arrM[i]){
				iguales = true;
			}
			else {
				iguales = false;
			}
		}
		return iguales;
	}
	
	public static void resolverOperaciones(int[]arrS, int[]arrM, int[]arrR, int cant){
		int pos = 0;
		int aux = 0;
		int inicioSecMod = 0;
		int largoSecMod = buscarLargoSecuencia(arrM, inicioSecMod, MAX2);
		int inicioSec = 0;
		int finSec = 0;
		while (aux < cant){
			inicioSec = buscarInicioSecuencia(arrS, MAX1, pos);
			int largoSec = buscarLargoSecuencia(arrS, inicioSec, MAX1);
			finSec = inicioSec + largoSec - 1;
			pos = finSec + 1;
			if (largoSec == largoSecMod){
				boolean iguales = compararSecuencias (arrS, arrM, inicioSec, finSec, largoSecMod);
				if ((iguales == true) && (aux < cant)){
					aux++;
				}
			}
		}
		if (aux == cant){
			reemplazarSecuencias(arrS, arrR, largoSecMod, cant);
		}
	}

	public static void imprimirArreglo (int[]arr){
		for (int pos = 0; pos < MAX1; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
	}
}
