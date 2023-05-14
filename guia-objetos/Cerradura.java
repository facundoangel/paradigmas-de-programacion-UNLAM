package unlam.paradigmas.objetos.ej06;

public class Cerradura {

	private int clave;
	private int intentosFallidos;
	private boolean abierta;
	private boolean bloqueada;
	private int contIntentosExito;
	private int contIntentosFallido;
	

	public Cerradura(int claveDeApertura,
	                     int cantidadDeFallosConsecutivosQueLaBloquean){
	    	this.clave=claveDeApertura;
	    			this.intentosFallidos=cantidadDeFallosConsecutivosQueLaBloquean;
	    }
	
	

	/*
	 * pre: clave correcta
	 * post: se abre la puerta y retorna un booleano indicando si se 
	 * concreto o no la apertura
	 * */
	public boolean abrir(int clave) {
		boolean operacion = false;
		
		if(!this.bloqueada && clave==this.clave)
		{
			this.abierta=true;
			operacion=true;
			this.contIntentosExito++;
			this.contIntentosFallido=0;
		}
		else if(!this.bloqueada && clave!=this.clave ) {
			this.contIntentosFallido++;
			
			if(this.contIntentosFallido>=this.intentosFallidos)
				this.bloqueada=true;
		}
		
		
		
		return operacion;
	}

	/*
	 * post: se cierra la puerta
	 * */
	public void cerrar() {
		this.abierta=false;
	}

	/*
	 * post: indica si la puerta esta abierta
	 * */
	public boolean estaAbierta() {
		return this.abierta;
	}

	/*
	 * post: indica si la puerta esta cerrada
	 * */
	public boolean estaCerrada() {
		return !this.abierta;
	}

	
	/*
	 * post: indica si la puerta esta bloqueada
	 * */
	public boolean fueBloqueada() {
		return this.bloqueada;
	}

	
	/*
	 * post: indica cantidad de aperturas exitosas
	 * */
	public int contarAperturasExitosas() {
		return this.contIntentosExito;
	}

	
	/*
	 * post: indica cantidad de aperturas fallidas
	 * */
	public int contarAperturasFallidas() {
		return this.contIntentosFallido;
	}
	
	
}
