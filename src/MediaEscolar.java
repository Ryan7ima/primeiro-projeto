import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua nota de Matematica:");
        double nota1 = scanner.nextDouble();
        while (nota1 < 0 || nota1 > 10){
            System.out.println("Nota Invalida");
            nota1 = scanner.nextDouble();
        }

        System.out.println("Digite sua nota de Biologia:");
        double nota2 = scanner.nextDouble();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("Nota Invalida");
            nota2 = scanner.nextDouble();
        }

        System.out.println("Digite sua nota de Português:");
        double nota3 = scanner.nextDouble();
        while (nota3 < 0 || nota3 > 10){
            System.out.println("Nota Invalida");
            nota3 = scanner.nextDouble();
        }

        System.out.println("Digite sua nota de Filosofia:");
        double nota4 = scanner.nextDouble();
        while (nota4 < 0 || nota4 > 10){
            System.out.println("Nota Invalida");
            nota4 = scanner.nextDouble();
        }

        double media = (nota1 + nota2 + nota3 + nota4)/4;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat df = new DecimalFormat("#0.00");

        if (media >= 0 && media < 2){
            System.out.println("Sua média é: " + df.format(media) + " Sua Media é Pessimo");
        }
        else if (media >= 2 && media < 5){
            System.out.println("Sua média é: " + df.format(media) + " Sua Media é Ruim");
        }
        else if (media >= 5 && media < 7){
            System.out.println("Sua média é: " + df.format(media) + " Sua Media é Regular");
        }
        else if (media >= 7 && media < 10){
            System.out.println("Sua média é: " + df.format(media) + " Sua Media é Otima");

        } else if (media == 10 ){
            System.out.println("Sua média é: " + df.format(media) + " VOCÊ É BRABO");
        }
        else {
            System.out.println("Valor invalido");
        }

        if (media >= 7){
            System.out.println("Você está aprovado ✅");
        }
        else {
            System.out.println("Você está reprovado ❌");
        }
    }
}

//O que falta para o proximo nivel de nota
