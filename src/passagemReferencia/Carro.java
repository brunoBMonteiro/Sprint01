package passagemReferencia;

public class Carro {
    private String cor;
    private String modelo;
    private int ano;

    public Carro(String cor, String modelo, int ano){
        this.cor = cor;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibeDados(){
        System.out.println("A cor do carro é: " + cor);
        System.out.println("A modelo do carro é: " + modelo);
        System.out.println("A ano do carro é: " + ano);
    }
}
