package practicaCursada;

public class Practico8a {
	final static int MAX = 10;
	final static int MAXIMO = 100;

	public static void main(String[] args) {
		int A[] = new int [MAX];
		cargarArreglo(A);
		imprimirArreglo(A);
	}
	
	public static void cargarArreglo(int [] arr){
		for (int con = 0; con < MAX; con++)
			arr[con]=(int)(Math.random()* MAXIMO + 1);
	}
	
	public static void imprimirArreglo (int [] arr){
		System.out.println("Los números son :");
		for (int con = 0; con < MAX; con++)
			System.out.println(arr[con]);
	}
}
