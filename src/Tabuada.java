import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int mult = 1; mult <= 100; mult++) {
            System.out.println(numero + " X " + mult + " = " + (numero * mult));
        }
    }
}