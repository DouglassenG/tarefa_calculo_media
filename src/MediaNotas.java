public class MediaNotas {

    public static void main(String[] args) {

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;
        double nota4 = 9.0;

        int quantidadeNotas = 4;

        double media = (nota1 + nota2 + nota3 + nota4) / quantidadeNotas;

        System.out.println("=== Calculadora de Média ===\n");
        System.out.println("Notas informadas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
        System.out.printf("Média final: %.2f%n", media);
    
    }
}