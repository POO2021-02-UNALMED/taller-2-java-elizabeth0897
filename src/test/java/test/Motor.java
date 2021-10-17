package test;
public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int numero) {
		this.registro = numero;
	}
	
	void asignarTipo(String tipoMotor) {
		if (tipoMotor.equals("gasolina")||tipoMotor.equals("electrico")) {
			this.tipo = tipoMotor;
		}
	}
}
