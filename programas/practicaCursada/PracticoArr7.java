package practicaCursada;

public class PracticoArr7 {
	final static int MAX = 10;
	final static int MAXIMO = 100;

	public static void main(String[] args) {
		int[] Arreglo = new int [MAX];
		cargarArregloOrdDec(Arreglo);
		imprimirArreglo(Arreglo);
	}

	public static void cargarArregloOrdDec(int[]arr){
		for (int i = 0; i < MAX; i++){
			arr[i] = (int)(Math.random() * MAXIMO + 1);
			int aux = arr[i];
			int j = i - 1;
			while ((j >= 0) && (arr[j] < aux)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
	}
	
	
	public static void imprimirArreglo(int[]arr){
		System.out.println("El arreglo es :");
		for (int i = 0; i < MAX; i++){
			System.out.print(" " + arr[i]);
		}
		System.out.println("");
	}
	
}
