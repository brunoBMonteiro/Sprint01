package exceptions;
import java.util.Scanner;

public class Throws {
    public static void main(String[] args){

        System.out.println("Entre com um numero decimal");
        try {
            double num = leNumero();
            System.out.println("Voce digitou " + num);
        }catch (Exception e){
            System.out.println("Entrada inválida");

            // ajuda a descobrir onde está o erro
            e.printStackTrace();
        }

    }

    public static double leNumero() throws Exception{
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        return num;
    }
}
