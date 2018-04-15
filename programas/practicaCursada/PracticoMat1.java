package practicaCursada;

public class PracticoMat1 {
	final static int MAXFILAS = 10;
	final static int MAXCOLUMNAS = 10;

	public static void main(String[] args) {
		int[][] Matriz = {
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9},
				{0,1,2,3,4,5,6,7,8,9}
		};
		imprimirMatriz(Matriz);
		int columna = 4;
		int sumaColumna = sumaColumna(Matriz, columna);
		System.out.println("La suma de la columna " + columna + " es : " + sumaColumna);
		int fila = 6;
		int sumaFila = sumaFila(Matriz, fila);
		System.out.println("La suma de la fila " + fila + " es : " + sumaFila);
		float promedioColumna = promedioColumna(Matriz, columna);
		System.out.println("El promedio de la columna " + columna + " es : " + promedioColumna);
		invertirFila(Matriz, fila);
		imprimirMatriz(Matriz);
	}

	public static void imprimirMatriz(int[][]mat){
		System.out.println("La matriz es :");
		for (int fila = 0; fila < MAXFILAS; fila++){
			for (int col = 0; col < MAXCOLUMNAS; col++){
				System.out.print(" " + mat[fila][col]);
			}
			System.out.println("");
		}
	}
	
	public static int sumaColumna(int[][]mat, int col){
		int suma = 0;
		for (int fila = 0; fila < MAXFILAS; fila++){
			suma += mat[fila][col];
		}
		return suma;
	}
	
	public static int sumaFila(int[][]mat, int fil){
		int suma = 0;
		for (int col = 0; col < MAXCOLUMNAS; col++){
			suma += mat[fil][col];
		}
		return suma;
	}
	
	public static float promedioColumna(int[][]mat, int col){
		float promedio = (float)0.0;
		for (int fila = 0; fila < MAXFILAS; fila++){
			promedio += mat[fila][col];
		}
		return (promedio / MAXCOLUMNAS);
	}
	
	public static void invertirInicioConFin(int[][]mat, int fil){
		int aux = mat[fil][0];
		mat[fil][0] = mat[fil][MAXFILAS-1];
		mat[fil][MAXFILAS-1] = aux;
		
	}
	
	public static void invertirFila(int[][]mat, int fil){
		int[]aux = new int [MAXFILAS];
		int posAux = 0;
		for (int pos = 0; pos < MAXFILAS; pos++){
			aux[posAux] = mat[fil][pos];
			posAux++;
		}
		posAux = 0;
		for (int pos = MAXFILAS - 1; pos >=0; pos--){
			mat[fil][pos] = aux[posAux];
			posAux++;
		}
	}
	
}
