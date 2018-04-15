package practicaCursada;

public class PracticoMat5 {
	final static int MAXFILAS = 4;
	final static int MAXCOLUMNAS = 5;

	public static void main(String[] args) {
		char[][]Matriz = {
				{'a','u','d','h','b'},
				{'e','h','x','w','g'},
				{'t','s','e','v','a'},
				{'r','h','f','b','q'}
		};
		ordenarMatrizChar(Matriz);
		imprimirMatriz(Matriz);
	}

	public static void ordenarMatrizChar(char[][]mat){
		for (int fila = 0; fila < MAXFILAS; fila++){
			for (int columna = 0; columna < MAXCOLUMNAS; columna++){
				char aux = mat[fila][columna];
				int j = columna - 1;
				while ((j >= 0) && (mat[fila][j] > aux)){
					mat[fila][j+1] = mat[fila][j];
					j--;
				}
				mat[fila][j+1] = aux;
			}
		}
	}
	
	public static void imprimirMatriz(char[][]mat){
		System.out.println("La matriz es :");
		for (int fila = 0; fila < MAXFILAS; fila++){
			for (int columna = 0; columna < MAXCOLUMNAS; columna++){
				System.out.print(" " + mat[fila][columna]);
			}
			System.out.println("");
		}
	}
	
}
