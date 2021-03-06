package practicaCursada;

public class PracticoArr6 {
	final static int MAX = 10;
	final static int MAXIMO = 100;

	public static void main(String[] args) {
		int[] Arreglo = new int [MAX];
		cargarArreglo(Arreglo);
		ordenarArregloDecreciente(Arreglo);
		imprimirArreglo(Arreglo);
		int posicion = 4;
		eliminarElemento(Arreglo, posicion);
		imprimirArreglo(Arreglo);
	}

	public static void cargarArreglo(int[]arr){
		for (int pos = 0; pos < MAX; pos++){
			arr[pos] = (int) (Math.random() * MAXIMO + 1);
		}
	}
	
	public static void ordenarArregloDecreciente (int[]arr){
		for (int i = 0; i < MAX; i++){
			int aux = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] < aux)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
	}
	
	public static void imprimirArreglo (int[]arr){
		System.out.println("El arreglo es :");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
	}

	public static void eliminarElemento (int[]arr, int pos){
		for (int i = pos; i < MAX - 1; i++){
			arr[i] = arr[i+1];
		}
		arr[MAX-1] = 0;
	}
	
}
