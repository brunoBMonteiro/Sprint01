package sobrecarga;

public class Teste {
    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("", "", "", "", "", "");
        pessoa.reacao("feliZ");
        pessoa.reacao(14);
        pessoa.reacao(false);

    }
}
