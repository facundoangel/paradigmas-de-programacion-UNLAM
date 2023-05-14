package edu.unlam.paradigmas.excepciones.ej05;

public class RetiroDeSaldosException extends Exception {
	private String msg;

	public RetiroDeSaldosException(String msg) {
		super(msg);
		this.msg = msg;
	}
}
