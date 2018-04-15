package practicaCursada;

public class PracticoPOO_Cuenta {
	private int numCuenta;
	private double saldoCuenta;
	
	PracticoPOO_Cuenta (int num, double saldo){
		numCuenta = num;
		saldoCuenta = saldo;
	}
	
	public int getNumCuenta(){
		return numCuenta;
	}
	
	public double getSaldo(){
		return saldoCuenta;
	}
	
	public void recibirAbonos(double abono){
		saldoCuenta += abono;
	}
	
	public void pagarRecibos(double recibo){
		if (saldoCuenta >= recibo){
			saldoCuenta -= recibo;
		}
	}
	
}
