package abstracao;

public abstract class Carro {

    protected String modelo;
    protected double valor;

    public Carro(String modelo, double valor){
        this.modelo = modelo;
        this.valor = valor;
    }

    public Carro(){

    }

    public abstract void modelo();
}
