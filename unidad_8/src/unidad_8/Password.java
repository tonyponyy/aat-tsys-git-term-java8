package unidad_8;

import java.util.Iterator;

public class Password {
	private Integer longitud;
	private String contraseña;
	
	public Password() {
		this.longitud=8;
		this.contraseña="";
	}
	
	public Password(int longitud) {
		this.longitud=longitud;
		this.contraseña="";
	}
	
	public String generar_aleatorio(int longitud) {
		String password="";
		for (int i = 0; i < longitud; i++) {
		int aleatorio = (int) (Math.random() * (126 - 32 + 1) + 32);	
		char randomChar = (char) aleatorio;
		password += randomChar;
		}
		return password;
	}

}
