public class TrabalhandoComStrings {
    public static void main(String[] args) {
        String nome = "Ryan";
        String nomeDois = "Ryan";

        int tamanhoString = nome.length();
        boolean saoIguias = nome.equals(nomeDois);

        System.out.println("Olá " + nome.toLowerCase() + " seu nome tem " + tamanhoString + " caracteres");
        System.out.println("Os nomes são iguais: " + saoIguias);
    }
}
