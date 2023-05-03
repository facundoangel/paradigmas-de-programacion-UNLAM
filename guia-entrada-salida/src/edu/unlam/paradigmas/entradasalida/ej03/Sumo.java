package edu.unlam.paradigmas.entradasalida.ej03;

class Sumo{
    private int peso;
    private int altura;
    
    public Sumo(int peso, int altura){
        this.peso=peso;
        this.altura=altura;
    }

    
    public boolean dominaAContricante(Sumo sumo){
        return this.altura>=sumo.altura && this.peso>=sumo.peso;
    }
}