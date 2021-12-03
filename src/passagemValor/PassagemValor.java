package passagemValor;

public class PassagemValor {
    public static void main(String[] args) {
        int data = 10;
        System.out.println("Antes de chamar o método: " + data);
        processData(data);
        System.out.println("Depois de chamar o método: " + data);

    }

    private static void processData(int data){
        data = data + 20;
    }

}
