package CriandoException;

public class DivisaoNaoExata extends Exception{
    private int numeros;
    private int denominadores;

    public DivisaoNaoExata(int numeros, int denominadores){
        super();
        this.numeros = numeros;
        this.denominadores = denominadores;
    }

    public String toString(){
        return "Resultado de " + numeros + "/" + denominadores + " não é um inteiro!";
    }


}
