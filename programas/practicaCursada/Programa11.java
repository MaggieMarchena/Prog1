package practicaCursada;

public class Programa11 {
	public static void main(String[] args) {
		int i, j, k, l;
		i = 7;
		j = 3;
		k = 1;
		l = 3;
		System.out.println("(i==j)||(i==k) " + ((i == j) || (i == k)));
		System.out.println("(i==j)||(i==k)&&(i==2) " + ((l == j) || (i == k) && (i == 2)));
		System.out.println("(i==j)||((i==k)&&(i==2)) " + ((i == j) || ((i == k) && (i == 2))));
	}
}
