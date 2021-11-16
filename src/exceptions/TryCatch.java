package exceptions;

public class TryCatch {
        public static void main(String[] args){

            // Sem o tratamento de exceção
            /*
            int[] vetor = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Esse texto não será impresso");
             */
            try {
                int[] vetor = new int[4];

                System.out.println("Antes da exception");

                vetor[4] = 1;

                System.out.println("Esse texto não será impresso");
            }catch (ArrayIndexOutOfBoundsException exception){
                System.out.println("Erro ao atribuir a posição inexistente");
            }
            System.out.println("Ainda está funcionando!");
    }
}
