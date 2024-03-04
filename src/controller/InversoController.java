package controller;

public class InversoController {
	public InversoController() {
		super(); 
	}
	
	public String Funcaoinv (String palavra) {
		// Condição de parada é a string vazia ou só com um caractere, já está invertida
		if(palavra.length()<=1) {
			return palavra; 
		}else {
			// Inverter a substring restante e concatenar com o primeiro caractere
			return Funcaoinv(palavra.substring(1)) + palavra.substring(0, 1);
			
		}
	}	
}
