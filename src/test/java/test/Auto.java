package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int n = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] instanceof Asiento) {
				n = n+1;
			}	
		}
		return n;
	}
	
	String verificarIntegridad() {
		if(motor.registro != registro) {
			return "Las piezas no son originales";
		} else {
			for(int i = 0; i< asientos.length; i++) {
				if(asientos[i] != null && registro != asientos[i].registro) {
					return "Las piezas no son originales";
				}
			}
		return "Auto original";
		}
	}	
}