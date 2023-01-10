import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o tamanho da pirâmide?");

        int number = input.nextInt();

        System.out.println();

        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
