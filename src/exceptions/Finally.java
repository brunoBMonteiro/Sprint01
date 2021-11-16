package exceptions;

public class Finally {
    public static void main(String[] args){

        // multiplos de 2 e 4
        int[] numeros = {4, 8, 16 , 32, 64, 128};

        // denominadores
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++){
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + "=" + (numeros[i] / denominadores[i]));
            }
            catch (ArithmeticException e){
                System.out.println("Erro ao dividir por zero");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Posição do array inválida");
            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch");
            }
        }

    }
}
