package Contador;
import java.util.Scanner;

public class Contador {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Parametro 1: ");
            int para1 = scan.nextInt();
            System.out.print("Parametro 2: ");
            int para2 = scan.nextInt();

            contar(para1, para2);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        } finally {
            scan.close();
        }
    }

    static void contar(int num1, int num2) throws IllegalArgumentException {
        if (num1 >= num2) {
            throw new IllegalArgumentException("Primeiro parametro deve ser menor que o segundo!!!");
        } else {
            int cont = num2 - num1;
            for (int i = 1; i <= cont; i++) {
                System.out.println("imprimindo " + i);
            }
        }
    }
}