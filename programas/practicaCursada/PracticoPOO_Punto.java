package practicaCursada;

public class PracticoPOO_Punto {
	public double x;
	public double y;
	
	PracticoPOO_Punto (double _x, double _y){
		x = _x;
		y = _y;
	}
	
	public int obtenerCuadrante(){
		int cuad = 0;
		if ((x >= 0) && (y >= 0)){
			cuad = 1;
		}
		else if ((x < 0) && (y >= 0)){
			cuad = 2;
		}
		else if ((x < 0) && (y < 0)){
			cuad = 3;
		}
		else {
			cuad = 4;
		}
		return cuad;
	}

	public double obtenerDistanciaAOrigen(){
		double distancia = Math.sqrt((x*x) + (y*y));
		return distancia;
	}
	
 	public void moverACuad1(){
		x = Math.abs(x);
		y = Math.abs(y);
	}
	
}
