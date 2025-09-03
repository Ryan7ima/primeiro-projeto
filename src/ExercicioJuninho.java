import java.util.Scanner;

public class ExercicioJuninho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior numero é:" + numero1);
        } else if (numero2 > numero1){
            System.out.println("O maior numero é:" + numero2);
        }
        else {
            System.out.println("Os numeros são iguias");
        }
    }
}
