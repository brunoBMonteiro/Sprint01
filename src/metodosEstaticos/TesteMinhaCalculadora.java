package metodosEstaticos;

public class TesteMinhaCalculadora {
    public static void main(String[] args){
        // SEM O MODIFICADOR DE ACESSO STATIC
        /*
        MinhaCalculadora calculadora = new MinhaCalculadora();
        calculadora.soma(1,2);
         */

        // COM O MODIFICADOR DE ACESSO STATIC no método da classe MinhaCalculadora
        System.out.println(MinhaCalculadora.soma(1,2));
    }
}
