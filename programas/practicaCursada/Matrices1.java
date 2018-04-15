package practicaCursada;

public class Matrices1 {
	final static int MAX = 5;
	final static int MAXNUM = 100;

	public static void main(String args[]) {
		int B[][] = new int[MAX][MAX];
		cargar_matriz(B);
		imprimir_matriz(B);
	}

	public static void imprimir_matriz(int[][] mat) {
		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++)
				System.out.print(" " + mat[i][j]);
			System.out.println("");
		}
	}

	public static void cargar_matriz(int[][] mat) {
		for (int i = 0; i < MAX; i++)
			for (int j = 0; j < MAX; j++)
				mat[i][j] = (int) (Math.random() * MAXNUM + 1);
	}
}
