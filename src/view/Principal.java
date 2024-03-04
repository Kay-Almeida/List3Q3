package view;

import controller.InversoController;

public class Principal {
	public static void main(String[] args) {
		InversoController inv = new InversoController(); 
		
		String palavra = "Anotaram a data da maratona";
		System.out.println("A palavra " + palavra + " ao inverso é "+ inv.Funcaoinv(palavra));
		
	}
	

}
