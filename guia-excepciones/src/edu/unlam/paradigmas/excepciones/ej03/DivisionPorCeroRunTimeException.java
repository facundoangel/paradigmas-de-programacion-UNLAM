package edu.unlam.paradigmas.excepciones.ej03;

public class DivisionPorCeroRunTimeException extends RuntimeException {
	private String msg;
	
	public DivisionPorCeroRunTimeException(String msg)
	{
		super(msg);
		this.msg=msg;
	}
}
