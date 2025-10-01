import java.util.Scanner;
public class Divertidamente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alegria = 0;
        int tristeza = 0;

        // --- Amizades ---
        System.out.print("Riley fez novas amizades na cidade? (sim=1 / nao=0): ");
        int fezAmizades = scanner.nextInt();

        if (fezAmizades == 1) {
            System.out.print("Quantas amizades Riley fez? ");
            int qtdAmizades = scanner.nextInt();
            alegria += qtdAmizades * 10;
        } else {
            tristeza += 30;
        }

        // --- Provas ---
        System.out.print("Digite a nota da prova A1 (0 a 10): ");
        double A1 = scanner.nextDouble();

        System.out.print("Digite a nota da prova A2 (0 a 10): ");
        double A2 = scanner.nextDouble();

        System.out.print("Digite a nota da prova A3 (0 a 10): ");
        double A3 = scanner.nextDouble();

        double media = (A1 + A2 + A3) / 3.0;

        if (media >= 7) {
            alegria += 50;
        } else {
            tristeza += 50;
        }

        // --- Exercícios de programação ---
        System.out.print("Quantos exercícios de programação (0 a 10) Riley conseguiu fazer? ");
        int exercicios = scanner.nextInt();

        if (exercicios >= 0 && exercicios <= 10) {
            alegria += exercicios * 10;
            tristeza += (10 - exercicios) * 10;
        } else {
            System.out.println("Valor inválido! Considerando que Riley não fez nenhum exercício.");
            tristeza += 100; // todos não feitos
        }

        // --- Resultado final ---
        System.out.println("\nPontuação final:");
        System.out.println("Alegria: " + alegria + " pontos");
        System.out.println("Tristeza: " + tristeza + " pontos");

        if (alegria > tristeza) {
            System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley.");
        } else {
            System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley.");
        }

        scanner.close();
    }
}
