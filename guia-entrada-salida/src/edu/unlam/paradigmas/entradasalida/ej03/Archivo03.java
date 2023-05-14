package edu.unlam.paradigmas.entradasalida.ej03;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class Archivo03{
    private String nombre;
    private String ruta;
    private String extension;
    
    public Archivo03(String nombre){
        this.nombre = nombre;
        this.ruta=this.extension="";
    }
    
    public Archivo03(String nombre,String ruta, String extension){
        this.nombre = nombre;
        this.ruta=ruta;
        this.extension=extension;
    }
    
    public void escribirArchivo(int resultados[]) {
    	
    	FileWriter file=null;
    	PrintWriter pw=null;
    	
    	try {
    		
    		file = new FileWriter("casos-pruebas/out/" + this.nombre + ".out");
    		pw = new PrintWriter(file);
    		
    		for(int elem : resultados)
    			pw.println(elem);
    		
    	}catch(IOException e){
    		e.printStackTrace();
    	}finally {
    		if(file!=null) {
    			try {
    				file.close();
    			}catch(Exception e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	
    }
    
    public Sumo[] leerArchivo()
    {
        Sumo[] sumos= null;
        File file = null;
        Scanner scanner = null;
        
        try{
            file = new File((this.ruta.length()>0? this.ruta : "casos-pruebas/in/")
            		+this.nombre+
            		(this.extension.length()>0?this.extension:".in"));
            scanner = new Scanner(file);
            
            scanner.useLocale(Locale.ENGLISH);
            
            int cantRegistros = scanner.nextInt();
            sumos = new Sumo[cantRegistros];
            

            for(int i=0;i<cantRegistros;i++)
                sumos[i] = new Sumo(scanner.nextInt(),scanner.nextInt());
            
            
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(scanner!=null)
            	scanner.close();
        }
        
        
        
        return sumos;
    }
}