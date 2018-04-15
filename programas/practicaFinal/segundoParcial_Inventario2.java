package practicaFinal;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class segundoParcial_Inventario2 {
	final static int MAXFILAS = 2;
	final static int MAXCOLUMNAS = 15;

	public static void main(String[] args) {
		int[][] Inventario = {
				{100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114},
				{31, 137, 48, 149, 13498, 1257, 1349, 64, 64, 1328, 116, 49, 42, 679, 25}
		};
		int[][] matrizCopia = new int [MAXFILAS][MAXCOLUMNAS];
		int fila = 1;
		int ValorCantidad = obtenerEntero();
		copiarDatosRelevantes(Inventario, matrizCopia, ValorCantidad, fila);
		ordenarMatrizDescendenteSegunFila(matrizCopia, fila);
		imprimirValoresMatriz(matrizCopia);
		
		int ValorNroProducto = obtenerEntero();
		int pos = buscarPosDes (Inventario, ValorNroProducto, fila-1);
		if (pos != -1){
			eliminarColumnaMatriz (Inventario, pos);
		}
		imprimirValoresMatriz (Inventario);
	}
	
	public static int obtenerEntero () {
		BufferedReader entrada = new BufferedReader(new InputStreamReader (System.in));
		int a = 0;
		boolean enteroValido = false;
		do {
			try {
				System.out.println("Ingrese cantidad :");
				a = new Integer(entrada.readLine());
				enteroValido = true;
			}catch (NumberFormatException e){
				System.out.println("Entero no válido, ingrese nuevamente");
				enteroValido = false;
			}catch (Exception exc){
				System.out.println(exc);
			}
		}while (!(enteroValido));
		return a;
	}
	
	public static void copiarDatosRelevantes (int[][]mat, int[][]copia, int cant, int fil){
		for (int col = 0; col < MAXCOLUMNAS; col++){
			if(mat[fil][col] < cant){
				copia[fil-1][col] = mat[fil-1][col];
				copia[fil][col] = mat[fil][col];
			}
		}
	}
	
	public static void ordenarMatrizDescendenteSegunFila (int[][]mat, int fil){
		for (int pos = 1; pos < MAXCOLUMNAS; pos++){
			int aux1 = mat[fil][pos];
			int aux2 = mat[fil-1][pos];
			int i = pos-1;
			while ((i >= 0) && (mat[fil][i] < aux1)){
				mat[fil][i+1] = mat[fil][i];
				mat[fil-1][i+1] = mat [fil-1][i];
				i--;
			}
			mat[fil][i+1] = aux1;
			mat[fil-1][i+1] = aux2;
		}
	}
	
	public static void imprimirValoresMatriz (int[][]mat){
		for (int fil = 0; fil < MAXFILAS; fil++){
			for (int col = 0; col < MAXCOLUMNAS; col++){
				if(mat[fil][col] != 0){
					System.out.print(" " + mat[fil][col]);
				}
			}
			System.out.println("");
		}
	}

	public static int buscarPosDes (int[][]mat, int valor, int fil){
		int pos = 0;
		while ((pos < MAXCOLUMNAS) && (mat[fil][pos] != valor)){
			pos++;
		}
		if (pos >= MAXCOLUMNAS){
			return -1;
		}else {
			return pos;
		}
	}
	
	public static void eliminarColumnaMatriz (int[][]mat, int p){
		if (p != -1){
			for (int fil = 0; fil < MAXFILAS; fil++){
				for (int col = p; col < MAXCOLUMNAS-1; col++){
					mat[fil][col] = mat[fil][col+1];
				}
				mat[fil][MAXCOLUMNAS-1] = -1;
			}
		}else {
			System.out.println("El número de producto no existe");
		}
	}
}
