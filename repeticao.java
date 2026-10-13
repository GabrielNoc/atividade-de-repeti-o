import java.util.Scanner;

public class repeticao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();


        int n;
        do {
            System.out.print("Digite um número positivo: ");
            n = scanner.nextInt();

        } while (n < 0);


        System.out.println("\n Números de 0 até " + n + " ");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + (i < n ? ", " : ""));
        }
        System.out.println();


        System.out.println("\n Números de " + n + " até 0");
        for (int i = n; i >= 0; i--) {
            System.out.print(i + (i > 0 ? ", " : ""));
        }
        System.out.println();


        System.out.println("\n Exibição do nome: ");
        if (nome.length() > 6) {
            int quantidade = nome.length();
            for (int i = 1; i <= quantidade; i++) {
                System.out.println(i + "ª vez: " + nome);
            }
        } else {

            System.out.println("O nome possui 6 letras ou menos. Exibindo uma vez:");
            System.out.println(nome);
        }

        scanner.close();
    }
}