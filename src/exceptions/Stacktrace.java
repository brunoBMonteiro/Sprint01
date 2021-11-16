package exceptions;

public class Stacktrace {
    public static void main(String[] args) {

        // multiplos de 2 e 4
        int[] numeros = {4, 8, 16, 32, 64, 128};
        // denominadores
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
            } catch (Exception e){
                // getMessage retorna a descrição do erro
                System.out.println(e.getMessage());
                // imprime o stacktrace do erro, mostra a linha do erro
                e.printStackTrace();
            }
        }
    }
}
