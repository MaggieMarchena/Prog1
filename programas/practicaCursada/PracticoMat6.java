package practicaCursada;

public class PracticoMat6 {
	final static int MAXFILAS = 11;
	final static int MAXCOLUMNAS = 2;

	public static void main(String[] args) {
		double[][]Temperaturas = {
				{20.3, 40.3},
				{14.6, 38.8},
				{11.2, 31.2},
				{6.9, 26.1},
				{0.5, 22.8},
				{-0.7, 22.8},
				{-2.6, 15.6},
				{-2.7, 19.2},
				{1.1, 29.3},
				{6.2, 26.4},
				{8.8, 38.3},
				{10.8, 40.3}
		};
		imprimirMatriz(Temperaturas);
		double[]CopiaTempMax = new double [MAXFILAS];
		int columna = 1;
		copiarColumnaEnArreglo(Temperaturas, CopiaTempMax, columna);
		ordenarArregloCreciente(CopiaTempMax);
		int[]Meses = new int [MAXFILAS];
		copiarPosicionDeTemp(Temperaturas, CopiaTempMax, columna, Meses);
		imprimirArreglo(Meses);
		
	}

	public static void imprimirMatriz(double[][]mat){
		System.out.println("La matriz es :");
		for (int fila = 0; fila < MAXFILAS; fila++){
			for (int columna = 0; columna < MAXCOLUMNAS; columna++){
				System.out.print(" " + mat[fila][columna]);
			}
			System.out.println("");
		}
	}
	
	public static void imprimirArreglo(int[]arr){
		System.out.println("El arreglo es :");
		for (int pos = 0; pos < MAXFILAS; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
	}
	
	public static void imprimirArreglo(double[]arr){
		System.out.println("El arreglo es :");
		for (int pos = 0; pos < MAXFILAS; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
	}
	
	public static void copiarColumnaEnArreglo(double[][]mat, double[]arr, int col){
		for (int fila = 0; fila < MAXFILAS; fila++){
			arr[fila] = mat[fila][col];
		}
	}
	
	public static void ordenarArregloCreciente(double[]arr){
		for (int pos = 1; pos < MAXFILAS; pos++){
			double aux = arr[pos];
			int j = pos - 1;
			while ((j >= 0) && (arr[j] > aux)){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = aux;
		}
	}
	
	public static void copiarPosicionDeTemp(double[][]mat, double[]arr, int col, int[]M){
			int posArr = 0;
			while (posArr < MAXFILAS){
				int fila = 0;
				int pos = 0;
				while ((pos < MAXFILAS) && (arr[posArr] != mat[fila][col])){
					fila++;
					pos++;
				}
				if ((pos < MAXFILAS) && (arr[posArr] == mat[fila][col])){
					M[posArr] = pos + 1;
				}
				posArr++;
			}
	}
	
}
