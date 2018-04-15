package practicaFinal;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class segundoParcial_Inventario {
	final static int MAXFILAS = 2;
	final static int MAXCOLUMNAS = 15;

	public static void main(String[] args) {
		int[][] Inventario = {
				{100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114},
				{31, 137, 48, 149, 13498, 1257, 1349, 54, 64, 1328, 116, 49, 42, 679, 25}
		};
		int fila = 1;
		int[] arregloCopia = new int [MAXCOLUMNAS];
		int ValorCantidad = ObtenerEntero();
		copiarFilaEnArreglo (arregloCopia, Inventario, fila, ValorCantidad);
		imprimirValidosArreglo (arregloCopia);
	}
	
	public static int ObtenerEntero() {
		int a = 0;
		boolean valido = false;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				System.out.println("Ingrese cantidad :");
				a = new Integer(entrada.readLine());
				valido = true;
			}catch (NumberFormatException e){
				System.out.println("Formato no válido");
				valido = false;
			}catch (Exception exc){
				System.out.println(exc);
				valido = false;
			}
		}while (!(valido));
		return a;
	}

	public static void copiarFilaEnArreglo (int[]arrC, int[][]mat, int fil, int cant){
		int mayor = 1000000000;
		for (int i = 0; i < MAXCOLUMNAS; i++){
			int aux = mat[fil][0];
			aux = buscarMayor(fil, aux, mayor, mat);
			mayor = aux;
			int col = buscarPosDes(mat, mayor, fil);
			if (mayor < cant){
				arrC[i] = mat[fil-1][col];
			}
		}
	}
	
	public static int buscarMayor (int f, int x, int m, int[][]mt){
		for (int i = 1; i < MAXCOLUMNAS; i++){
			if ((mt[f][i] > x) && (mt[f][i] <= m)){
				x = mt[f][i];
			}
		}
		return x;
	}
	
	public static int buscarPosDes (int[][]mat, int valor, int fil){
		int pos = 0;
		while ((pos < MAXCOLUMNAS) && (mat[fil][pos] != valor)){
			pos++;
		}
		return pos;
	}
	
	public static void imprimirValidosArreglo (int[]arr){
		for (int i = 0; i < MAXCOLUMNAS; i++){
			if (arr[i] != 0){
				System.out.print(" " + arr[i]);
			}
		}
		System.out.println("");
	}
	
}
