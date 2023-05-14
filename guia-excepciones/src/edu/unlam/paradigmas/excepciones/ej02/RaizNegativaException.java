package edu.unlam.paradigmas.excepciones.ej02;

public class RaizNegativaException extends Exception
{
    
    private String msg;
    
    public RaizNegativaException(String msg)
    {
        super(msg);
        this.msg = msg;
    }
    
    public String getMessage()
    {
        return this.msg;
    }
}