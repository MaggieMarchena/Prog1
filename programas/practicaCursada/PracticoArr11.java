package practicaCursada;

public class PracticoArr11 {
	final static int MAX = 15;
	final static int MAXPATRON = 3;

	public static void main(String[] args) {
		int[]Arreglo = {0,0,1,2,3,0,0,1,2,0,1,2,3,0,0};
		int[]Patron = {1,2,3};
		imprimirArreglo(Arreglo);
		eliminarPatron(Arreglo, Patron);
		imprimirArreglo(Arreglo);
	}

	public static void imprimirArreglo(int[]arr){
		System.out.println("El arreglo es :");
		for (int pos = 0; pos < MAX; pos++){
			System.out.print(" " + arr[pos]);
		}
		System.out.println("");
	}
	
	public static int buscarInicioSecuencia(int[]arr, int p){
		while ((p < MAX) && (arr[p] == 0)){
			p++;
		}
		if ((p < MAX) && (arr[p] != 0)){
			return p;
		}
		else {
			return -1;
		}
	}
	
	public static int buscarLargoSecuencia(int[]arr, int in){
		int pos = in;
		while ((pos < MAX) && (arr[pos] != 0)){
			pos++;
		}
		return pos - in;
	}
	
	public static void eliminarElemento(int[]arr, int pos){
		for (int i = pos; i < MAX - 1; i++){
			arr[i] = arr[i+1];
		}
		arr[MAX-1] = 0;
	}
	
	public static void eliminarPatron(int[]arr, int[]pat){
		int pos = 0;
		int[] aux = new int [MAXPATRON];
		while (pos < MAX){
			int inicioSecuencia = buscarInicioSecuencia(arr, pos);
			if (inicioSecuencia != -1){
				int largoSecuencia = buscarLargoSecuencia(arr, inicioSecuencia);
				int finalSecuencia = inicioSecuencia + largoSecuencia - 1;
				if (largoSecuencia == MAXPATRON){
					int j = 0;
					for (int i = inicioSecuencia; i <= finalSecuencia; i++){
							aux[j] = arr[i];
							j++;
					}
					if (aux[0] == pat[0]){
						if (aux[1] == pat[1]){
							if (aux[2] == pat[2]){
								for (int i = inicioSecuencia; i <= finalSecuencia; i++){
									eliminarElemento (arr, inicioSecuencia);
									pos = inicioSecuencia;
								}
							}
						}
					}
				}
				else {
					pos = finalSecuencia;
				}
			}
			pos++;
		}
	}
	
}
