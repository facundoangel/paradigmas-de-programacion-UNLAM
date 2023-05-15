package edu.unlam.paradigmas.excepciones.ej04;

public class CuentaSinFondoException extends Exception {
	
	private String msg;
	
	public CuentaSinFondoException(String msg) {
		super(msg);
		this.msg=msg;
	}
}
