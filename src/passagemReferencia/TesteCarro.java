package passagemReferencia;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("vermelho", "fiat toro", 2015);
        Carro carro2 = new Carro("branco", "gol", 1995);
        // Referencia memória objeto1
        System.out.println(carro1.hashCode());

        // Referencia memória objeto2
        System.out.println(carro2.hashCode());

        carro1.exibeDados();
        System.out.println("-----------------------");
        carro1 = carro2;

        carro1.exibeDados();
        System.out.println(carro1.hashCode());
    }
}
