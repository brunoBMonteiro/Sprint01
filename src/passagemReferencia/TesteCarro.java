package passagemReferencia;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("vermelho", "fiat toro", 2015);
        Carro carro2 = new Carro("branco", "gol", 1995);

        System.out.println(carro1.hashCode());
        carro1.exibeDados();
        System.out.println("-----------------------");
        System.out.println(carro1.hashCode());
        carro1 = carro2;

        carro1.exibeDados();
        System.out.println(carro1.hashCode());
    }
}
