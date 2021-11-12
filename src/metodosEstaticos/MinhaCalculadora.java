package metodosEstaticos;

public class MinhaCalculadora {
    // SEM MODIFICADOR DE ACESSO STATIC
    /*
    public int soma(int num1, int num2) {
        return num1 + num2;
    }
     */

    // COM MODIFICADOR DE ACESSO STATIC
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }


    public double soma(double num1, double num2){
        return num1 + num2;
    }

    /*
    *
    * public static double soma(double num1, double num2){
        return num1 + num2;
    }
    *
    * */

    /*
     *
     *   public int soma(int num1, int num2, int num3){
     *      return num1 + num2 + num3;
     *   }
     */

    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int soma(int[] vetorInteiros){
        int total = 0;

        for (int i = 0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }

        return total;
    }

    /*
    *
    *
    * public static int soma(int[] vetorInteiros){
        int total = 0;
        for (int i = 0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }
    *
    *
    * */
}
